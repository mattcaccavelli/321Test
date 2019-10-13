package ca.mcgill.ecse321.persistencetest;

import java.util.Set;
import javax.persistence.*;
import java.util.HashSet;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
private String name;

public User() {
	
}

public User(String ID, String NAME, String PASSWORD) {
	
}

public void setName(String value) {
   this.name = value;
}

public String getName() {
   return this.name;
}

//@Id
//@GeneratedValue(strategy=GenerationType.AUTO)
private String id;

public void setId(String value) {
   this.id = value;
}

public String getId() {
   return this.id;
}

private String password;

public void setPassword(String value) {
   this.password = value;
}

public String getPassword() {
   return this.password;
}

/**
 * <pre>
 *           1..1     0..3
 * User ------------------------- UserRole
 *           user        &gt;       userRole
 * </pre>
 */
private Set<UserRole> userRole;

public Set<UserRole> getUserRole() {
   if (this.userRole == null) {
this.userRole = new HashSet<UserRole>();
   }
   return this.userRole;
}

}
