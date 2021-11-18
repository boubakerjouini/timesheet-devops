package tn.esprit.timesheetdevops.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.timesheetdevops.entities.Departement;
import tn.esprit.timesheetdevops.services.Departements.IDepartementService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;

import java.util.List;

@SpringBootTest
public class DepartementServiceImplTest {

   @Autowired
   IDepartementService ds;


    @Test
    @Order(1)
    public void testRetrieveAllDepartments(){
        List<Departement> listDepartements = ds.retrieveAllDepartements();
        Assertions.assertTrue(listDepartements.size()>0);
    }

    @Test
    @Order(2)
    public void testAddDepartment(){
        Departement d = ds.addDepartement( new Departement("Informatique"));
        Assertions.assertNotNull(d);
    }

    @Test
    @Order(3)
    public void testUpdateDepartment(){
      Departement modified = new Departement("Technique");
      Departement departement = ds.updateDepartement(modified);
        Assertions.assertNotNull(departement);
    }
    @Test
    @Order(4)
    public void testRetrieveDepartment(){
        Assertions.assertEquals(1,ds.retrieveDepartement("1").getId());
    }

    /*
    @Test
    @Order(3)
    public void testDeleteDepartment(){
        ds.deleteDepartement("2");
        Departement departement = null;
        Assertions.assertNull(departement);
    }*/
}