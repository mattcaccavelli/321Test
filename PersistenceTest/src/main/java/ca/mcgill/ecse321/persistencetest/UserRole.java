package ca.mcgill.ecse321.persistencetest;

public abstract class UserRole {
/**
 * <pre>
 *           0..3     1..1
 * UserRole ------------------------- User
 *           userRole        &lt;       user
 * </pre>
 */
private User user;

public void setUser(User value) {
   this.user = value;
}

public User getUser() {
   return this.user;
}

}
