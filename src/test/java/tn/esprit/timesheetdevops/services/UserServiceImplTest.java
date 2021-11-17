package tn.esprit.timesheetdevops.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.timesheetdevops.entities.Role;
import tn.esprit.timesheetdevops.entities.User;
import tn.esprit.timesheetdevops.services.IUserService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserServiceImplTest {
	
	@Autowired
	IUserService us;
	
	public Role generateRandom(){
		Role[] values = Role.values();
		int length = values.length;
		int randomIndex = new Random().nextInt(length);
		return values[randomIndex];
		}
	
	@Test
	@Order(1)
	public void addUserTest(){

		User u =  new User("Mourad","Tlili",new Date(), generateRandom());
		Assertions.assertNotNull(us.addUser(u));

	}

	@Test
	@Order(2)
	public void testRetrieveAllUsers(){
		List<User> listUsers = us.retrieveAllUsers();

		Assertions.assertTrue(listUsers.size()>=1);
	}
	
	@Test
	@Order(3)
	public void testRetrieveUser(){
		//User user = us.retrieveUser("2");
		Assertions.assertEquals(10,us.retrieveUser("10").getId());
	}
	/*
	@Test
	@Order(4)
	public void testupdateUser(){
		User expected = new User(10L,"Mourad", "Tlili" ,  new Date(), Role.ADMINISTRATEUR);
		User user = us.updateUser(expected);
		Assertions.assertEquals(expected,user);
	}
	*/
	
	
	
}
