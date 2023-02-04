package major;

import java.util.ArrayList;

public class Major {
    private String major;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public void addCourse(Course course) {
        courses.add(course);
    }   

    public Major(String major, int teacherID) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
