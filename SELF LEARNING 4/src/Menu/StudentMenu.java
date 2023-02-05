package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import major.Course;
import major.Major;
import user.AppManager;
import user.Student;

public class StudentMenu {
    private static Scanner input = new Scanner(System.in);
    private Student student;
    
    private void viewCourseDetail(){
        System.out.println("Course detail:");
        viewCourseList();
        int option;
        do{
            System.out.print("Choose course to view detail: ");
            option = input.nextInt(); input.nextLine();
        }while(option < 1 || option > AppManager.getStudentJoinedMajor(student.getId()).size());
        Major major = AppManager.getStudentJoinedMajor(student.getId()).get(option - 1);
        Course course = major.getCoursesByStudentId(student.getId());
        System.out.println("Course name: " + major.getMajor());
        ArrayList <Integer> taskScores = course.getTaskScore();
        ArrayList <Integer> examScores = course.getExamScore();

        System.out.println("Task score:");
        for (int i = 0; i < taskScores.size(); i++){
            System.out.println("\tTask " + (i + 1) + ": " + taskScores.get(i));
        }
        System.out.println("Average task score: " + course.getAverageTaskScore());

        System.out.println("Exam score:");
        for (int i = 0; i < examScores.size(); i++){
            System.out.println("\tExam " + (i + 1) + ": " + examScores.get(i));
        }
        System.out.println("Average exam score: " + course.getAverageExamScore());

        System.out.println("Average overall score: " + course.getAverageOverallScore());
    }

    private void viewCourseSummary(){
        System.out.println("Course score summary:");
        ArrayList <Major> majors = AppManager.getStudentJoinedMajor(student.getId());
        int counter = 1; 
        double total = 0;
        for (Major major : majors){
            System.out.println(counter + ". " + major.getMajor());
            counter++;
            Course course = major.getCoursesByStudentId(student.getId());

            if(course.getTaskScore().isEmpty()){
                System.out.println("\tTask Scores : No score");
            }
            else{
                System.out.println("\tTask Scores : " + course.getAverageTaskScore());
            }
            if (course.getExamScore().isEmpty()){
                System.out.println("\tExam Scores : No score");
            }
            else{
                System.out.println("\tExam Scores : " + course.getAverageExamScore());
            }
            
            System.out.println("\tAverage Scores : " + course.getAverageOverallScore());
            total += course.getAverageOverallScore();
        }
        System.out.println("\nTotal average score: " + (double) total/majors.size());
    }

    private void viewCourseList(){
        System.out.println("Course list:");
        ArrayList <Major> majors = AppManager.getStudentJoinedMajor(student.getId());
        int counter = 1;
        for (Major major : majors){
            System.out.println(counter + ". " + major.getMajor());
            counter++;
        }
    }

    public StudentMenu(Scanner input) {
        this.input = input;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    public void printMenu(){
        System.out.println("\nStudent menu:");
        System.out.println("1. View course list");
        System.out.println("2. View course score summary");
        System.out.println("3. View course score detail");
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
                    viewCourseList();
                    break;
                case 2: 
                    viewCourseSummary();
                    break;
                case 3: 
                    viewCourseDetail();
                    break;
                case 0: 
                    break;
                default: 
                    break;
            }
            if (menu != 0){
                System.out.print("Press enter to continue...");
                input.nextLine();
            }
        }while(menu != 0);
    }
}
