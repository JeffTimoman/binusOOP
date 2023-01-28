package Session5.Menu;

import Session5.Ride;

public class MainMenu {
    public static void main(String[] args) {
        Ride ride = new Ride("B 1234 ABC", "08123456789", "Jl. Jalan", "Jl. Jalan");
        System.out.println(ride.calculatePrice());
    }
}
