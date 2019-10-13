package ca.mcgill.ecse321.persistencetest;

public class Availability {
/**
 * <pre>
 *           0..7     1..1
 * Availability ------------------------- Tutor
 *           availability        &lt;       tutor
 * </pre>
 */
private Tutor tutor;

public void setTutor(Tutor value) {
   this.tutor = value;
}

public Tutor getTutor() {
   return this.tutor;
}

private int startTime;

public void setStartTime(int value) {
   this.startTime = value;
}

public int getStartTime() {
   return this.startTime;
}

private int endTime;

public void setEndTime(int value) {
   this.endTime = value;
}

public int getEndTime() {
   return this.endTime;
}

private Day dayOfWeek;

public void setDayOfWeek(Day value) {
   this.dayOfWeek = value;
}

public Day getDayOfWeek() {
   return this.dayOfWeek;
}

}
