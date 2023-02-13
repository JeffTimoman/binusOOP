

import java.util.ArrayList;

public class Temp {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> ruth = new ArrayList<Integer>();
        ruth.add(1);
        ruth.add(2);
        ruth.add(3);
        ruth.add(4);

        // for (int i = 0; i < ruth.size(); i++) {
        //     System.out.println(ruth.get(i));
        // }
        for (Integer x : ruth){
            System.out.println(x);
        }
    }
}
