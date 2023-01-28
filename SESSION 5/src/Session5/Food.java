package Session5;

import java.util.ArrayList;

class Food extends Service{
    private ArrayList <String> foodName;

    public Food(String plate, String noHandphone, String alamatAsal, String alamatTujuan) {
        super(plate, noHandphone, alamatAsal, alamatTujuan);
        foodName = new ArrayList<>();
    }
}