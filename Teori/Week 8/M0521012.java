import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M0521012 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        List<KaryawanTetap> Tetap = new ArrayList<>();
        List<KaryawanKontrak> Kontrak = new ArrayList<>();

        Tetap.add(new KaryawanTetap("SM023", "Mark", "Laweyan", 6000000, 350000, 1000000));
        Tetap.add(new KaryawanTetap("SM012", "Yeri", "Jebres", 7000000, 350000, 1000000));
        Tetap.add(new KaryawanTetap("SM089", "Kris", "Jebres", 7000000, 350000, 1000000));
        Tetap.add(new KaryawanTetap("SM223", "Lily", "Laweyan", 6000000, 350000, 1000000));
        Kontrak.add(new KaryawanKontrak("YG011", "Lisa", "Serengan", 225000, 25));
        Kontrak.add(new KaryawanKontrak("YG044", "Rose", "Serengan", 225000, 20));
        Kontrak.add(new KaryawanKontrak("YG077", "Ruto", "Jebres", 225000, 9));

        System.out.println("\nDAFTAR KARYAWAN SMTOWN\n");
        
        System.out.println("> Karyawan Tetap\n");
        System.out.println("Id      Nama          Alamat\t\t\t   Gaji\n");
        for (var Karyawan : Tetap) {
            System.out.printf("%s   %s          %s\t\t\tRp.%d\n", Karyawan.getIdKaryawan(), Karyawan.getNamaKaryawan(), Karyawan.getAlamatKaryawan(), Karyawan.hitungGajiKaryawan());
        }
        
        System.out.println("\n> Karyawan Kontrak\n");
        System.out.println("Id      Nama          Alamat\t\t\t   Gaji\n");
        for (var Karyawan : Kontrak)
            System.out.printf("%s   %s          %s\t\t\tRp.%d\n", Karyawan.getIdKaryawan(), Karyawan.getNamaKaryawan(), Karyawan.getAlamatKaryawan(), Karyawan.hitungGajiKaryawan());
        
        scan.close();
    }
}

class Karyawan {
    String idKaryawan;
    public String namaKaryawan;
    private String alamatKaryawan;
    protected Integer gajiKaryawan;

    public Karyawan(String idKaryawan, String namaKaryawan, String alamatKaryawan, Integer gajiKaryawan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.alamatKaryawan = alamatKaryawan;
        this.gajiKaryawan = gajiKaryawan;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public Integer getGajiKaryawan() {
        return gajiKaryawan;
    }

    public void setGajiKaryawan(Integer gajiKaryawan) {
        this.gajiKaryawan = gajiKaryawan;
    }
    
    public Integer hitungGajiKaryawan() {
        return gajiKaryawan;
    }
}

class KaryawanTetap extends Karyawan {
    private Integer gajiKaryawanTetap, uangMakan, tunjangan;

    public KaryawanTetap(String idKaryawan, String namaKaryawan, String alamatKaryawan, Integer gajiKaryawanTetap, Integer uangMakan, Integer tunjangan) {
        super(idKaryawan, namaKaryawan, alamatKaryawan, 0);
        this.gajiKaryawanTetap = gajiKaryawanTetap;
        this.uangMakan = uangMakan;
        this.tunjangan = tunjangan;
        this.hitungGajiKaryawan();
    }

    public Integer getGajiKaryawanTetap() {
        return gajiKaryawanTetap;
    }

    public void setGajiKaryawanTetap(Integer gajiKaryawanTetap) {
        this.gajiKaryawanTetap = gajiKaryawanTetap;
        this.hitungGajiKaryawan();
    }

    public Integer getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(Integer uangMakan) {
        this.uangMakan = uangMakan;
        this.hitungGajiKaryawan();
    }

    public Integer getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(Integer tunjangan) {
        this.tunjangan = tunjangan;
        this.hitungGajiKaryawan();
    }

    public Integer hitungGajiKaryawan() {
        gajiKaryawan = gajiKaryawanTetap + uangMakan + tunjangan;
        return gajiKaryawan;
    }
}

class KaryawanKontrak extends Karyawan {
    private Integer gajiHarian, jumlahHariMasuk;

    public KaryawanKontrak(String idKaryawan, String namaKaryawan, String alamatKaryawan, Integer gajiHarian, Integer jumlahHariMasuk) {
        super(idKaryawan, namaKaryawan, alamatKaryawan, 0);
        this.gajiHarian = gajiHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
        hitungGajiKaryawan();
    }

    public Integer getGajiHarian() {
        return gajiHarian;
    }

    public void setGajiHarian(Integer gajiHarian) {
        this.gajiHarian = gajiHarian;
        hitungGajiKaryawan();
    }

    public Integer getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setJumlahHariMasuk(Integer jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
        hitungGajiKaryawan();
    }

    public Integer hitungGajiKaryawan() {
        gajiKaryawan = gajiHarian * jumlahHariMasuk;
        return gajiKaryawan;
    }
}