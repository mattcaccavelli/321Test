package ca.mcgill.ecse321.persistencetest;

import java.util.Set;
import java.util.HashSet;

public class Student extends UserRole {
/**
 * <pre>
 *           1..1     0..*
 * Student ------------------------- Review
 *           student        &gt;       review
 * </pre>
 */
private Set<Review> review;

public Set<Review> getReview() {
   if (this.review == null) {
this.review = new HashSet<Review>();
   }
   return this.review;
}

/**
 * <pre>
 *           1..*     0..*
 * Student ------------------------- Session
 *           student        &gt;       session
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
 * Student ------------------------- Course
 *           student        &gt;       course
 * </pre>
 */
private Set<Course> course;

public Set<Course> getCourse() {
   if (this.course == null) {
this.course = new HashSet<Course>();
   }
   return this.course;
}

public void viewCourses() {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public void searchForCourse(String/*No type specified*/ String) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public Review writeReview(String/*No type specified*/ Rating, String/*No type specified*/ String) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

}
