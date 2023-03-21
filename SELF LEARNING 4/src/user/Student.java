package user;

import java.util.ArrayList;

import major.Course;

public class Student extends User{
    private static int id = 0;
    private int studentID = setID();
    private ArrayList <Course> courses = new ArrayList<Course>();

    public Student(String username, String password, String name) {
        super(username, password, name);
    }

    public static int setID() {
        return id++;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public int getId() {
        return studentID;
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
    @Override
    public String toString() {
        return "Name : " + getName() + "Username : " + getUsername();  
    }
}
