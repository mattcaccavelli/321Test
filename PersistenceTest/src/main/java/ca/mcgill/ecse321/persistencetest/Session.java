package ca.mcgill.ecse321.persistencetest;

import java.util.Set;
import java.util.HashSet;

public abstract class Session {
/**
 * <pre>
 *           0..*     0..1
 * Session ------------------------- Manager
 *           session        &lt;       manager
 * </pre>
 */
private Manager manager;

public void setManager(Manager value) {
   this.manager = value;
}

public Manager getManager() {
   return this.manager;
}

/**
 * <pre>
 *           0..*     1..1
 * Session ------------------------- Course
 *           session        &gt;       course
 * </pre>
 */
private Course course;

public void setCourse(Course value) {
   this.course = value;
}

public Course getCourse() {
   return this.course;
}

/**
 * <pre>
 *           0..*     1..1
 * Session ------------------------- Tutor
 *           session        &lt;       tutor
 * </pre>
 */
private Tutor tutor;

public void setTutor(Tutor value) {
   this.tutor = value;
}

public Tutor getTutor() {
   return this.tutor;
}

/**
 * <pre>
 *           0..*     1..*
 * Session ------------------------- Student
 *           session        &lt;       student
 * </pre>
 */
private Set<Student> student;

public Set<Student> getStudent() {
   if (this.student == null) {
this.student = new HashSet<Student>();
   }
   return this.student;
}

}
