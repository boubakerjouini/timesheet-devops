package tn.esprit.timesheetdevops.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.timesheetdevops.entities.Departement;

public interface DepartementRepository extends CrudRepository<Departement,Integer> {
}