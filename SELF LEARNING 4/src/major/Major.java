package major;

import java.util.ArrayList;

import user.Student;
import user.AppManager;

public class Major {
    private String major;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public void addCourse(Course course) {
        courses.add(course);
        Student temp = AppManager.getStudent(course.getStudentID());
        if (temp != null) {
            temp.addCourse(course);
        }
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

    public Course getCoursesByStudentId(int studentId) {
        for (Course course : courses) {
            if (course.getStudentID() == studentId) {
                return course;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return major + "Number of Students : " + courses.size() + "";
    }
}
