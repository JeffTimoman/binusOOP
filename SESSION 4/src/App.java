public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Hero p1 = new Hero("Hero 1", 10, 100);
        Hero p1 = new Hero("Hero 1");
        p1.show();
        p1.train();
        p1.show();
    }
}

class Hero{
    String name;
    int attack;
    int energy;

    void sleep(){
        if(energy + 50 > 100){
            energy = 100;
            System.out.println("Energy : " + energy);
            return;
        }

        energy += 50;
        System.out.println("Energy : " + energy);
    }

    void train(){
        if(energy - 10 < 0){
            System.out.println("Energy is not enough!");
            return;
        }

        energy -= 10;
        attack += 5;
        System.out.println("Energy : " + energy);
        System.out.println("Attack : " + attack);
    }
    void show(){
        System.out.println("Name : " + name);
        System.out.println("Attack : " + attack);
        System.out.println("Energy : " + energy);
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 100){
            throw new IllegalArgumentException("Name is too long! 1 - 100");
        }
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Constructor
    Hero(String name){
        this.setName(name);
        this.energy = 100;
    }

    //Overloading
    Hero(String name, int energy, int attack){
        this.setName(name);
        this.attack = attack;
        this.energy = energy;
    }

    //Overloading
    Hero(String name, int energy){
        this.setName(name);
        this.energy = 100;
    }

    Hero(){

    }
}

/* 
 Access modifier : public, private, protected, default
    public : bisa diakses dari mana saja

 Class | Package | Inheritance | Public
    public : bisa diakses dari mana saja
    default : hanya bisa diakses di package yang sama
    protected : bisa diakses di package yang sama dan di inheritance
    private : hanya bisa diakses di class yang sama
*/