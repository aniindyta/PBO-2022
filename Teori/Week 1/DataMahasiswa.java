import java.util.Scanner;

public class DataMahasiswa {
    String NIM, Nama, JenisKelamin, Alamat;

    public static void main(String[] args) {
        DataMahasiswa dataMahasiswa = new DataMahasiswa();
        
        Scanner Input = new Scanner(System.in);

        System.out.println("                  Input Data Mahasiswa");
        System.out.println("--------------------------------------------------------");
        
        System.out.print("Masukkan NIM Anda             : ");
        String NIM = Input.nextLine();
        
        System.out.print("Masukkan Nama Anda            : ");
        String Nama = Input.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin Anda   : ");
        String JenisKelamin = Input.nextLine();
        
        System.out.print("Masukkan Alamat Anda          : ");
        String Alamat = Input.nextLine();

        Input.close();

        dataMahasiswa.IsiData(NIM, Nama, JenisKelamin, Alamat);
        dataMahasiswa.PrintData();
    }

    public void IsiData(String NIM, String Nama, String JenisKelamin, String Alamat) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.JenisKelamin = JenisKelamin;
        this.Alamat = Alamat;
    }

    public void PrintData() {
        System.out.println();
        System.out.println("                    Data Mahasiswa");
        System.out.println("--------------------------------------------------------");
        System.out.println("Nama            : " +this.Nama);
        System.out.println("NIM             : " +this.NIM);
        System.out.println("Jenis Kelamin   : " +this.JenisKelamin);
        System.out.println("Alamat          : " +this.Alamat);
    }
}