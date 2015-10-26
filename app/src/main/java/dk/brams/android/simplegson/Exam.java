package dk.brams.android.simplegson;

/**
 * Created by tbrams on 26/10/15.
 */
public class Exam {
    private String SUBJECT;
    private double GRADE;

    // Getters and setters are not required for this example.
    // GSON sets the fields directly using reflection.

    @Override
    public String toString() {
        return SUBJECT + " - " + GRADE;
    }
}
