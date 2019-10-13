package ca.mcgill.ecse321.persistencetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PersistenceTestApplication {

	@Autowired
	UserRepository UR;
	
	public static void main(String[] args) {
		SpringApplication.run(PersistenceTestApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		UR.save(new User("001", "Matt", "abc"));
		UR.save(new User("002", "Greg", "ac"));
		UR.save(new User("003", "Edward", "abb"));
		
	}
}
