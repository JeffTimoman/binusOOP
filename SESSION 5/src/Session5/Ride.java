package Session5;

public class Ride extends Service{
    private int jumlahPenumpang;
    public Ride(String plate, String noHandphone, String alamatAsal, String alamatTujuan) {
        super(plate, noHandphone, alamatAsal, alamatTujuan);
        jumlahPenumpang = 1;
    }

    // OverLoader
    public Ride(String plate, String noHandphone, String alamatAsal, String alamatTujuan, int jumlahPenumpang) {
        super(plate, noHandphone, alamatAsal, alamatTujuan);
        this.jumlahPenumpang = jumlahPenumpang;
    }
}