package ca.mcgill.ecse321.persistencetest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//extends CrudRepository<User, String>
@Repository
public class UserRepository {
		
	@Autowired
	EntityManager entitymanager;
	
	@Transactional
	public User CreateUser(String ID, String Name, String Password) {
		User u = new User();
		u.setId(ID);
		u.setName(Name);
		u.setPassword(Password);
		entitymanager.persist(u);
		return u;
	}
	
	@Transactional
	public User getUser(String ID) {
		User u = entitymanager.find(User.class, ID);
		return u;
	}
}
