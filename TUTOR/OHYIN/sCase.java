import java.util.ArrayList;
import java.util.Scanner;

class Nendoroid{
    private String name;
    private int price;
    private int sold = 0;
    private int stock;
    private String id = generateID();

    public Nendoroid(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String generateID(){
        String result = "";
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Masukin cahracter 1 dan character 2;
        result += chars.charAt((int)(Math.random() * chars.length()));
        result += chars.charAt((int)(Math.random() * chars.length()));

        // Math random -> random angka dari 0.0 sampai 1.0
        //1 * 9 = 9 -> 0.0 sampai 0.9
        result += Integer.toString((int)(Math.random() * 9));
        result += Integer.toString((int)(Math.random() * 9));
        result += Integer.toString((int)(Math.random() * 9));

        return result;
    }


}

class Validator{

    public static boolean checkExist(String id, ArrayList<Nendoroid> nendoroidList){
        for (Nendoroid n : nendoroidList){
            if (n.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public static boolean validateName(String name){

        if(name.length() < 5 || name.length() > 20){
            System.out.println("Name must be between 5 and 20 characters");
            return false;
        }

        return true;
    }

    public static boolean validatePrice(int price){
        if (price < 100 || price > 500){
            System.out.println("Price must be between 100 and 500");
            return false;
        }

        return true;
    }

    public static boolean validateStock(int stock){
        if (stock < 0 || stock > 500){
            System.out.println("Stock must be between 0 and 500");
            return false;
        }

        return true;
    }

    public static boolean validateAmount(int amount, int stock){
        if (stock <= 0 || stock < amount){
            System.out.println("Invalid amount");
            return false;
        }

        return true;
    }
}

public class sCase {
    private static int menu;
    private static Scanner input = new Scanner(System.in);
    private static ArrayList <Nendoroid> nendoroidList = new ArrayList<Nendoroid>();

    public static void addNendoroid(){
        String name;
        do {
            System.out.print("Enter Name [5-20]: ");
            name = input.nextLine();
        }while(!(Validator.validateName(name)));

        int price;
        do{
            System.out.print("Enter Price [100-500]: ");
            price = input.nextInt(); input.nextLine();
        }while(!(Validator.validatePrice(price)));

        int stock; 
        do{
            System.out.print("Enter Stock [0-500]: ");
            stock = input.nextInt(); input.nextLine();
        }while(!(Validator.validateStock(stock)));

        Nendoroid temp = new Nendoroid(name, price, stock);
        System.out.println("Nendoroid " + name + " added!");
        nendoroidList.add(temp);
    }
    public static void updateNendoroid(){
        /* Sort ArrayList by ID
         * Tampilkan semua data yang telah disorting. 
         * 
         * Minta user memilih id yang valid dari arraylist yang telah ditampilkan
         * Minta user memasukkan name serta stock, dan validasikan inputnya.
         * Update data yang ada didalam array list. 
         * 
         * Tampilkan kembali semua data.
         */
    }
    public static void sellNendoroid(){
        // View Note : Sort
        // Sort -> berdasarkan nama A-Z

        // Select NENDOROID ID, (harus ada nendoroid yang punya id itu)
        // Jumlah yang mau dibeli. (Tidak boleh melebihi stok yang dipunya)
        // Keluarin total harga barang 
        // Kasih diskon 1-5 % dirandom.
        // Keluarin total, dengan jumlah diskon, dan harga akhir.
        // Kurangin stok nendoroid, + sold.

        //Sorting
        nendoroidList.sort((Nendoroid n1, Nendoroid n2) -> n1.getName().compareTo(n2.getName()));
        viewNendoroid();
        // Data1, Data2, Data3, Data4, Data5
        // (Data1, Data2) -> compare
        // (Data2, Data3) 
        // ...
        // (Data5, null) -> stop

        if (nendoroidList.isEmpty()){
            return;
        }

        String id;
        do{
            System.out.print("Enter Nendoroid ID: ");
            id = input.nextLine();
        }while(!(Validator.checkExist(id, nendoroidList)));

        Nendoroid nendoroid = getNendoroidByID(id);

        if (nendoroid.getStock() == 0){
            System.out.println("No stock!");
            return;
        }

        int amount; 
        do{
            System.out.printf("Enter amount [1-%d]", nendoroid.getStock());
            amount = input.nextInt(); input.nextLine();
        }while(!(Validator.validateAmount(amount, nendoroid.getStock())));
        
        int totalPrice = amount * nendoroid.getPrice();
        System.out.printf("Total payment : %d\n", totalPrice);
        int discount = 1 + ((int) (Math.random() * 5));
        int discountAmount = (int) (discount * 0.01 * totalPrice);
        System.out.printf("Discount [%d] : %d\n", discount, discountAmount);
        System.out.printf("Total Price   : %d\n", totalPrice - discountAmount);

        nendoroid.setStock(nendoroid.getStock() - amount);
        nendoroid.setSold(nendoroid.getSold() + amount);
        System.out.println("Thank for the purchase!");
    }
    public static Nendoroid getNendoroidByID(String id){
        for (Nendoroid temp : nendoroidList){
            if (temp.getId().compareTo(id) == 0){
                return temp;
            }
        }
        return null;
    }
    public static void viewNendoroid(){
        System.out.println("Nendroid List!");
        
        if (nendoroidList.size() == 0){
            System.out.println("There is no avaiable nendoroid!");
            return;
        }

        System.out.printf("%-7s | %-20s | %-10s | %-10s | %-10s\n", "ID", "Name", "Price", "Sold", "Stock");
        System.out.println("====================================================================");
        for (Nendoroid temp : nendoroidList){
            System.out.printf("%-7s | %-20s | %-10d | %-10d | %-10d\n", temp.getId(), temp.getName(), temp.getPrice(), temp.getSold(), temp.getStock());
        }
        System.out.println("====================================================================");

    }

    public static void printMenu() {
        System.out.println("1. Add Nendoroid");
        System.out.println("2. Sell Nendoroid");
        System.out.println("3. View Nendoroid");
        System.out.println("4. Update Nendoroid");
        System.out.println("0. Exit");
        System.out.print(">> ");
    }

    public static void main(String[] args) {
        Nendoroid n1 = new Nendoroid("Nendoroid 1", 10000, 10);
        Nendoroid n2 = new Nendoroid("Aendoroid 2", 20000, 20);
        nendoroidList.add(n1);
        nendoroidList.add(n2);
        do {
            printMenu();
            menu = input.nextInt(); input.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Add Nendoroid");
                    addNendoroid();
                    break;
                case 2:
                    System.out.println("Sell Nendoroid");
                    sellNendoroid();
                    break;
                case 3:
                    System.out.println("View Nendoroid");
                    viewNendoroid();
                    break;
                case 4 : 
                    System.out.println("Update Nendoroid");
                    updateNendoroid();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.print("Press to continue...."); input.nextLine();
        } while (menu != 0);
        
        input.close();
    }
}
