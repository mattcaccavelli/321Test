package ca.mcgill.ecse321.persistencetest;

import java.util.Set;
import java.util.HashSet;

public class Tutor extends UserRole {
private boolean isVerified;

public void setIsVerified(boolean value) {
   this.isVerified = value;
}

public boolean isIsVerified() {
   return this.isVerified;
}

public Review writeReview(String/*No type specified*/ Rating, String/*No type specified*/ String) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

public Availability setAvailatbility(String/*No type specified*/ Day, String/*No type specified*/ one, String/*No type specified*/ two) {
   // TODO implement this operation
   throw new UnsupportedOperationException("not implemented");
}

/**
 * <pre>
 *           1..1     0..*
 * Tutor ------------------------- Review
 *           tutor        &gt;       review
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
 *           1..1     0..7
 * Tutor ------------------------- Availability
 *           tutor        &gt;       availability
 * </pre>
 */
private Set<Availability> availability;

public Set<Availability> getAvailability() {
   if (this.availability == null) {
this.availability = new HashSet<Availability>();
   }
   return this.availability;
}

/**
 * <pre>
 *           1..*     0..*
 * Tutor ------------------------- Course
 *           tutor        &gt;       course
 * </pre>
 */
private Set<Course> course;

public Set<Course> getCourse() {
   if (this.course == null) {
this.course = new HashSet<Course>();
   }
   return this.course;
}

/**
 * <pre>
 *           1..1     0..*
 * Tutor ------------------------- Session
 *           tutor        &gt;       session
 * </pre>
 */
private Set<Session> session;

public Set<Session> getSession() {
   if (this.session == null) {
this.session = new HashSet<Session>();
   }
   return this.session;
}

private int hourlyRateForOne;

public void setHourlyRateForOne(int value) {
   this.hourlyRateForOne = value;
}

public int getHourlyRateForOne() {
   return this.hourlyRateForOne;
}

private int hourlyRateForGroup;

public void setHourlyRateForGroup(int value) {
   this.hourlyRateForGroup = value;
}

public int getHourlyRateForGroup() {
   return this.hourlyRateForGroup;
}

/**
 * <pre>
 *           1..1     1..1
 * Tutor ------------------------> Manager
 *           &gt;       manager
 * </pre>
 */
private Manager manager;

public void setManager(Manager value) {
   this.manager = value;
}

public Manager getManager() {
   return this.manager;
}

}
