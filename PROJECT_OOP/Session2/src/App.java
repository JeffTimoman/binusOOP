public class App {
    
    public App(){
        // Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("1234", "Danu", 3.85);
		System.out.println("m2 NIM :"+m2.getNIM());
		System.out.println("m2 name : "+ m2.getName());
		System.out.println("m2 GPA :"+m2.getGPA());
    }
    public static void main(String[] args) {
        new App();
    }
}

