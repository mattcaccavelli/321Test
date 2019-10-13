package ca.mcgill.ecse321.persistencetest;

import java.util.Set;
import java.util.HashSet;

public class Manager extends UserRole {
public void verifyTutor() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void removeTutor() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

/**
 * <pre>
 *           0..1     0..*
 * Manager ------------------------- Session
 *           manager        &gt;       session
 * </pre>
 */
private Set<Session> session;

public Set<Session> getSession() {
   if (this.session == null) {
this.session = new HashSet<Session>();
   }
   return this.session;
}

}
