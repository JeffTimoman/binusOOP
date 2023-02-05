package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import major.Course;
import user.Teacher;
import user.AppManager;
import user.Student;

public class TeacherMenu {
    private Scanner input;
    private static Teacher teacher;

    public void printStudentList(){
        System.out.println("Student list:");
        ArrayList <Course> courses = teacher.getMajor().getCourses();
        courses.sort((Course c1, Course c2) -> AppManager.getStudent(c1.getStudentID()).getName().compareTo(AppManager.getStudent(c2.getStudentID()).getName()));
        if (courses.isEmpty()) {
            System.out.println("No student in this major");
            return;
        }
        int counter = 1;
        for(Course course : courses){
            int temp = course.getStudentID();
            System.out.println(Integer.toString(counter) + ". " + AppManager.getStudent(temp).getName());
            counter++;
        }
        System.out.println("");
        
    }

    public void addStudentScore(){
        printStudentList();
        int option;
        do{
            System.out.print("Choose student to add score: ");
            option = input.nextInt(); input.nextLine();
        }while(option < 1 || option > teacher.getMajor().getCourses().size());

        int studentID = teacher.getMajor().getCourses().get(option - 1).getStudentID();
        Student student = AppManager.getStudent(studentID);
        int pick = 0;
        do{
            System.out.println("Student: " + student.getName());
            System.out.println("1. Add exam score");
            System.out.println("2. Add task score");
            System.out.print(">> ");
            pick = input.nextInt(); input.nextLine();
            switch(pick){
                case 1:
                    System.out.print("Enter exam score: ");
                    int score = input.nextInt(); input.nextLine();
                    teacher.getMajor().getCourses().get(option - 1).addExamScore(score);
                    break;
                case 2:
                    System.out.print("Enter task score: ");
                    score = input.nextInt(); input.nextLine();
                    teacher.getMajor().getCourses().get(option - 1).addTaskScore(score);
                    break;
                default:
                    break;
            }
        }while(pick < 1 || pick > 2);

    }

    private static void printMenu(){
        System.out.println("Welcome " + teacher.getName() + "!");
        System.out.println("1. Print student list");
        System.out.println("2. Add score for student");
        System.out.println("3. Print score for a student");
        System.out.println("0. Exit");
        System.out.print(">> ");
    }
    public void run(){
        int menu;
        do{
            printMenu();
            menu = input.nextInt(); input.nextLine();
            switch(menu){
                case 1:
                    printStudentList();
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 0: 
                    break;
                default:
            }
            if (menu != 0){
                System.out.print("Press to continue..."); input.nextLine();
            }
        }while(menu != 0);
    }

    public TeacherMenu(Scanner input){
        this.input = input;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
}
