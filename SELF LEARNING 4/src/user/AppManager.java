package user;

import java.util.ArrayList;

import major.Course;
import major.Major;

public class AppManager {
    private static ArrayList<Student> studentList = new ArrayList<Student>();
    private static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    private static ArrayList<Major> majorList = new ArrayList<Major>();

    public static ArrayList<Major> getMajorList() {
        return majorList;
    }
    public static ArrayList<Major> getStudentJoinedMajor(int studentId){
        ArrayList<Major> majors = new ArrayList<Major>();
        for(Major major : majorList){
            for(Course course : major.getCourses()){
                if(course.getStudentID() == studentId){
                    majors.add(major);
                }
            }
        }
        return majors;
    }

    public static void addMajor(Major major) {
        majorList.add(major);
    }

    public static void addStudent(Student student){
        studentList.add(student);
    }

    public static void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    public static Student getStudent(int id){
        for(Student student : studentList){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }
    public static Teacher validateTeacher(String username, String password){
        for(Teacher teacher : teacherList){
            if(teacher.getUsername().equals(username) && teacher.validatePassword(password)){
                return teacher;
            }
        }
        return null;
    }

    public static Student validateStudent(String username, String password){
        for(Student student : studentList){
            if(student.getUsername().equals(username) && student.validatePassword(password)){
                return student;
            }
        }
        return null;
    }
}
