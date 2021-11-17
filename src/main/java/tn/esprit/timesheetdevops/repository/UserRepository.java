package tn.esprit.timesheetdevops.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.timesheetdevops.entities.User;

@Repository
public interface UserRepository extends  CrudRepository<User, Long> {
	
	
}