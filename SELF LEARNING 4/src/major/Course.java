package major;

import java.util.ArrayList;

public class Course {
    private int studentID;
    private ArrayList<Integer> examScore = new ArrayList<Integer>();
    private ArrayList<Integer> taskScore = new ArrayList<Integer>();

    public void addExamScore(int score) {
        examScore.add(score);
    }

    public void addTaskScore(int score) {
        taskScore.add(score);
    }

    public void setStudentID(int id) {
        studentID = id;
    }

    public int getStudentID() {
        return studentID;
    }

    public Course(int id) {
        studentID = id;
    }
}
