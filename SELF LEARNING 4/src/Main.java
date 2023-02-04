import java.util.ArrayList;
import java.util.Scanner;

import Menu.TeacherMenu;
import major.Course;
import major.Major;
import user.Student;
import user.Teacher;
import user.UserManager;

public class Main {
    public static void innit(){
        majors.add(new Major("Mathematics", 1));
        majors.add(new Major("Physics", 2));
        majors.add(new Major("Chemistry", 3));
        majors.add(new Major("Biology", 4));
        majors.add(new Major("English", 5));

        UserManager.addStudent(new Student("student1", "123", "Student 1"));
        UserManager.addStudent(new Student("student2", "123", "Student 2"));
        UserManager.addStudent(new Student("student3", "123", "Student 3"));
        UserManager.addStudent(new Student("student4", "123", "Student 4"));
        UserManager.addStudent(new Student("student5", "123", "Student 5"));

        UserManager.addTeacher(new Teacher("teacher1", "123", "Teacher 1", majors.get(0)));
        UserManager.addTeacher(new Teacher("teacher2", "123", "Teacher 2", majors.get(1)));
        UserManager.addTeacher(new Teacher("teacher3", "123", "Teacher 3", majors.get(2)));
        UserManager.addTeacher(new Teacher("teacher4", "123", "Teacher 4", majors.get(3)));
        UserManager.addTeacher(new Teacher("teacher5", "123", "Teacher 5", majors.get(4)));

        for (int i = 0; i < 5; i++) {
            majors.get(i).addCourse(new Course(1));
            majors.get(i).addCourse(new Course(2));
            majors.get(i).addCourse(new Course(3));
            majors.get(i).addCourse(new Course(4));
            majors.get(i).addCourse(new Course(5));
        }
    }
    public static Teacher loginTeacher(){
        System.out.println("Login as teacher!");
        System.out.print("Username: "); String username = input.nextLine();
        System.out.print("Password: "); String password = input.nextLine();
        return UserManager.validateTeacher(username, password);
    }
    private static int menu;
    private static Scanner input = new Scanner(System.in);
    private static TeacherMenu teacherMenu = new TeacherMenu(input);
    private static ArrayList <Major> majors = new ArrayList<Major>();
    public static void main(String[] args) {
        do{
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
