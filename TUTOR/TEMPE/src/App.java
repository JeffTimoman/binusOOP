import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    public void insertMHS(){
        System.out.print("Masukkan nama: ");
        String name = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String NIM = input.nextLine();

        if (name.length() < 3){
            System.out.println("FAIL");
            return;
        }

        if (NIM.length() < 10){
            System.out.println("FAIL");
            return;
        }

        System.out.println("SUCCESS");
        mahasiswa.add(new Mahasiswa(name, NIM));

    }
    public static void main(String[] args) throws Exception {

        String temp = "aaaa";
        boolean check = Validator.validateName(temp);
        System.out.println(check);
    }
}
