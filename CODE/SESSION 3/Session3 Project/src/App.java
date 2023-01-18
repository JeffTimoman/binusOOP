import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[100];
        arr[0] = 123;
        System.out.println(arr[0]);
        array_list();
    }

    static void array_list(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(758);
        arr.add(0, 456);
        arr.set(1, 999);
        //overloading, nama function sama, beda jumlah param, beda type data param
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println("size: " + arr.size());
        for (int i = 0; i < 100; i++){
            arr.add((int) (Math.random() * 1000));
        }
        // Collections.sort(arr);
        // arr.sort(App::compare);
        arr.sort(Integer::compareTo);
        System.out.println("size: " + arr.size());
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println(arr.get(0));
        arr.remove(0);
        System.out.println(arr.get(0));
        System.out.println("size: " + arr.size());
        arr.remove(arr.size() - 1); // pop tail
    }

    static int compare(int a, int b){
        if (a==b) return 0;
        if (a > b) return -1;
        return 1;
    }

    static void vector(){
        Vector <String> ppti = new Vector<>();
        
    }
}
