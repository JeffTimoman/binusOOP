import java.util.ArrayList;
import java.util.Scanner;

import Menu.TeacherMenu;
import major.Course;
import major.Major;
import user.Student;
import user.Teacher;
import user.AppManager;

public class Main {
    public static void innit(){

        AppManager.addMajor(new Major("Mathematics", 1));
        AppManager.addMajor(new Major("Physics", 2));
        AppManager.addMajor(new Major("Chemistry", 3));
        AppManager.addMajor(new Major("Biology", 4));
        AppManager.addMajor(new Major("Computer Science", 5));

        AppManager.addStudent(new Student("student1", "123", "Student 1"));
        AppManager.addStudent(new Student("student2", "123", "Student 2"));
        AppManager.addStudent(new Student("student3", "123", "Student 3"));
        AppManager.addStudent(new Student("student4", "123", "Student 4"));
        AppManager.addStudent(new Student("student5", "123", "Student 5"));

        AppManager.addTeacher(new Teacher("teacher1", "123", "Teacher 1", AppManager.getMajorList().get(0)));
        AppManager.addTeacher(new Teacher("teacher2", "123", "Teacher 2", AppManager.getMajorList().get(1)));
        AppManager.addTeacher(new Teacher("teacher3", "123", "Teacher 3", AppManager.getMajorList().get(2)));
        AppManager.addTeacher(new Teacher("teacher4", "123", "Teacher 4", AppManager.getMajorList().get(3)));
        AppManager.addTeacher(new Teacher("teacher5", "123", "Teacher 5", AppManager.getMajorList().get(4)));

        for (int i = 0; i < 5; i++){
            AppManager.getMajorList().get(i).addCourse(new Course(0));
            AppManager.getMajorList().get(i).addCourse(new Course(1));
            AppManager.getMajorList().get(i).addCourse(new Course(2));
            AppManager.getMajorList().get(i).addCourse(new Course(3));
            AppManager.getMajorList().get(i).addCourse(new Course(4));
        }
        
    }
    public static Teacher loginTeacher(){
        System.out.println("Login as teacher!");
        System.out.print("Username: "); String username = input.nextLine();
        System.out.print("Password: "); String password = input.nextLine();
        return AppManager.validateTeacher(username, password);
    }
    private static int menu;
    private static Scanner input = new Scanner(System.in);
    private static TeacherMenu teacherMenu = new TeacherMenu(input);
    public static void main(String[] args) {
        innit();
        do{
            System.out.println("Welcome to Student Management System!");
            System.out.println("1. Login as student");
            System.out.println("2. Login as teacher");
            System.out.println("0. Exit");
            System.out.print(">> ");
            menu = input.nextInt(); input.nextLine();
            switch(menu){
                case 1: 
                break;
                case 2: 
                    Teacher teacher = loginTeacher();
                    if(teacher == null){
                        System.out.println("Login failed!");
                        break;
                    }
                    teacherMenu.setTeacher(teacher);
                    teacherMenu.run();
                    break;
                case 0: 
                    break;
                default:
            }
            System.out.print("Press enter to continue..."); input.nextLine();
        }while(menu != 0);
    }
}
