import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        double totalPembelian = sc.nextDouble();
        double diskon, totalSetelahDiskon;

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if(totalPembelian < 50000) {
            diskon = 0.0;
        } else if(totalPembelian <= 75000 ) {
            diskon = 0.05;
        } else if(totalPembelian <= 125000) {
            diskon = 0.15;
        } else {
            diskon = 0.2;
        }
        
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        totalSetelahDiskon = 0.0;
        totalSetelahDiskon = totalPembelian - (totalPembelian * diskon);

        // sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Anda mendapatkan diskon sebesar " + (int)(diskon * 100) + "% !\n" + "Nominal yang harus Anda bayar adalah : Rp. " + (int) totalSetelahDiskon);

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000