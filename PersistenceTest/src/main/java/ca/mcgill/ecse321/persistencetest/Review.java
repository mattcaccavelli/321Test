package ca.mcgill.ecse321.persistencetest;

public class Review {
/**
 * <pre>
 *           0..*     1..1
 * Review ------------------------- Student
 *           review        &lt;       student
 * </pre>
 */
private Student student;

public void setStudent(Student value) {
   this.student = value;
}

public Student getStudent() {
   return this.student;
}

/**
 * <pre>
 *           0..*     1..1
 * Review ------------------------- Tutor
 *           review        &lt;       tutor
 * </pre>
 */
private Tutor tutor;

public void setTutor(Tutor value) {
   this.tutor = value;
}

public Tutor getTutor() {
   return this.tutor;
}

private String feedback;

public void setFeedback(String value) {
   this.feedback = value;
}

public String getFeedback() {
   return this.feedback;
}

private Rating rating;

public void setRating(Rating value) {
   this.rating = value;
}

public Rating getRating() {
   return this.rating;
}

}
