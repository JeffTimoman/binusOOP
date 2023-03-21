package major;

import java.util.ArrayList;

public class Course {
    private int studentID;
    private ArrayList<Integer> examScore = new ArrayList<Integer>();
    private ArrayList<Integer> taskScore = new ArrayList<Integer>();

    public ArrayList<Integer> getExamScore() {
        return examScore;
    }

    public ArrayList<Integer> getTaskScore() {
        return taskScore;
    }

    public double getAverageExamScore() {
        int sum = 0;
        for (int i = 0; i < examScore.size(); i++) {
            sum += examScore.get(i);
        }
        if (examScore.size() == 0) return 0;
        return (double) sum / examScore.size();
    }

    public double getAverageTaskScore() {
        int sum = 0;
        for (int i = 0; i < taskScore.size(); i++) {
            sum += taskScore.get(i);
        }

        if(taskScore.size() == 0) return 0;
        return (double) sum / taskScore.size();
    }

    public double getAverageOverallScore() {
        if(getAverageExamScore() == 0 ) return getAverageTaskScore();
        if(getAverageTaskScore() == 0 ) return getAverageExamScore();
        if (getAverageExamScore() == 0 && getAverageTaskScore() == 0) return 0;
        return (double) (0.6 * getAverageExamScore()) + (0.4 * getAverageTaskScore());
    }

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
