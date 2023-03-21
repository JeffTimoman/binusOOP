package Session5;

public class Service {
    protected String driveName;
    protected String plate;
    protected String alamatAsal;
    protected String alamatTujuan;
    protected String namaCustomer;
    protected String noHandphone;
    
    public Service(String plate, String noHandphone, String alamatAsal, String alamatTujuan) {
        this.plate = plate;
        this.alamatAsal = alamatAsal;
        this.alamatTujuan = alamatTujuan;
        this.noHandphone = noHandphone;
    }

    public String getDriveName() {
        return driveName;
    }

    public String getPlate() {
        return plate;
    }

    public String getAlamatAsal() {
        return alamatAsal;
    }

    public void setAlamatAsal(String alamatAsal) {
        this.alamatAsal = alamatAsal;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public void setAlamatTujuan(String alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getNoHandphone() {
        return noHandphone;
    }
    
    public int calculatePrice(){
        return (alamatAsal + alamatTujuan).length() * 1000;
    }
    
    // public Service(){

    // }
}

// class Delivery extends Service{
//     private int beratBarang;

//     public Delivery(String plate, String noHandphone, String alamatAsal, String alamatTujuan, int beratBarang) {
//         super(plate, noHandphone, alamatAsal, alamatTujuan);
//         this.beratBarang = beratBarang;
//     }
// }

