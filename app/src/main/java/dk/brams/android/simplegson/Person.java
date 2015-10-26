package dk.brams.android.simplegson;

import java.util.List;

public class Person {
    private String NAME;
    private String LOCATION;
    private List<Exam> EXAM;

    // Getters and setters are not required for this example.
    // GSON sets the fields directly using reflection.

    @Override
    public String toString() {
        String exams="";
        for (Exam exam: EXAM) {
            exams+=exam.toString();
            exams+=" ";
        }
        return NAME + " - " + LOCATION + "\nExams: (" + exams + ")";
    }
}
