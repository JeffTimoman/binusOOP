import javax.xml.transform.Source;

public class Mahasiswa {
    private String NIM, Name;

    // Constructor
    public Mahasiswa(String Name, String NIM){
        this.Name = Name;
        this.NIM = NIM;
    }

    // Overloader
    // public Mahasiswa(String Name){
    //     this.Name = Name;
    //     System.out.println("Mahasiswa baru tanpa NIM telah terdaftar");
    // }

    // public Mahasiswa(){
    //     System.out.println("Mahasiswa baru telah terdaftar");
    // }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    
}
