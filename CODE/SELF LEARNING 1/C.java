import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H, M;
        String time = input.nextLine();
        H = Integer.parseInt(time.substring(0, 2));
        M = Integer.parseInt(time.substring(3, 5));
        H%=12;
        // double H_angle = (H * 30) + (M * 0.5);
        // double M_angle = M * 6;
        double M_angle = M/60.0 * 360;
        double H_angle = H/12.0 * 360 + M/60.0 * 30;
        double min_angle = Math.abs(H_angle - M_angle);
        if (min_angle > 180) {
            min_angle = 360 - min_angle;
        }
        System.out.println(min_angle);
        input.close();
    }
}
