package ca.mcgill.ecse321.persistencetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PersistenceTestApplication {

	@Autowired
	UserRepository UR;
	
	public static void main(String[] args) {
		SpringApplication.run(PersistenceTestApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		UR.CreateUser("001", "Matt", "abc");
		UR.CreateUser("002", "Greg", "ac");
		UR.CreateUser("003", "Edward", "abb");
		
	}
}
