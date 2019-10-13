package ca.mcgill.ecse321.persistencetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PersistenceTestApplication {

	@Autowired
	UserRepository UR;
	
	static boolean done = false;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(PersistenceTestApplication.class, args);
		if(done = true) {
			ctx.close();
		}
	}
	
	public void run(String... args) throws Exception {
		UR.CreateUser("001", "Matt", "abc");
		UR.CreateUser("002", "Greg", "ac");
		UR.CreateUser("003", "Edward", "abb");
		System.out.println("added users");
		done = true;
		return;
		
	}
}
