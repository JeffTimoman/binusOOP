package Menu;

import java.util.Scanner;
import user.Teacher;

public class TeacherMenu {
    private Scanner input;
    private static Teacher teacher;
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
                    
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 0: 
                    break;
                default:
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
