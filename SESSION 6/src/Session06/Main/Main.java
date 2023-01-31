package Session06.Main;

import Session06.GatotKaca;

public class Main {
    /*  
        Overloading
        1 Class
        - sama nama method
        - beda jumlah parameter
        - beda tipe data parameter
      
        overriding
        beda class
        - sama nama method, jumlah parameter, tipe data parameter
     
     */ 
    public static void main(String[] args) {
        GatotKaca p1 = new GatotKaca();
        GatotKaca p2 = new GatotKaca();
        // Hero tem = new Hero();
        System.out.println("p1 lvl: " + p1.getlvl());
        p1.attack(p2);
        System.out.println("p1 hp: " + p1.getHp());
        System.out.println("p2 hp: " + p2.getHp());
    }
    
}
