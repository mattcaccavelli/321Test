package ca.mcgill.ecse321.persistencetest;

import java.util.Set;
import java.util.HashSet;

public class Course {
/**
 * <pre>
 *           0..*     1..*
 * Course ------------------------- Tutor
 *           course        &lt;       tutor
 * </pre>
 */
private Set<Tutor> tutor;

public Set<Tutor> getTutor() {
   if (this.tutor == null) {
this.tutor = new HashSet<Tutor>();
   }
   return this.tutor;
}

private String subject;

public void setSubject(String value) {
   this.subject = value;
}

public String getSubject() {
   return this.subject;
}

private int courseNumber;

public void setCourseNumber(int value) {
   this.courseNumber = value;
}

public int getCourseNumber() {
   return this.courseNumber;
}

private String courseName;

public void setCourseName(String value) {
   this.courseName = value;
}

public String getCourseName() {
   return this.courseName;
}

/**
 * <pre>
 *           1..1     0..*
 * Course ------------------------- Session
 *           course        &lt;       session
 * </pre>
 */
private Set<Session> session;

public Set<Session> getSession() {
   if (this.session == null) {
this.session = new HashSet<Session>();
   }
   return this.session;
}

/**
 * <pre>
 *           0..*     0..*
 * Course ------------------------- Student
 *           course        &lt;       student
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
