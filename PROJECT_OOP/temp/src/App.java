import java.util.Scanner;

public class App {

    private String name;
    private int age;

    public App(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // public throw error if x is 5

    public static void random(int x) throws Exception {
        if (x == 5) {
            throw new Exception("x is 5");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        random(x);
    }
    
}
