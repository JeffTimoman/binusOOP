package user;

import java.util.ArrayList;

public class UserManager {
    private static ArrayList<Student> studentList = new ArrayList<Student>();
    private static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

    public static void addStudent(Student student){
        studentList.add(student);
    }

    public static void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    public static Student getStudent(String username){
        for(Student student : studentList){
            if(student.getUsername().equals(username)){
                return student;
            }
        }
        return null;
    }

    public static Teacher getTeacher(String username){
        for(Teacher teacher : teacherList){
            if(teacher.getUsername().equals(username)){
                return teacher;
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
