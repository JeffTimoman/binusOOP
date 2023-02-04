import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Random> list = new ArrayList <Random>();
        ArrayList <Random> list2 = new ArrayList <Random>();
        Random r = new Random();
        list.add(r);
        list2.add(r);
        list2.get(0).a = 10;

        System.out.println(list.get(0).a);
    }
}
