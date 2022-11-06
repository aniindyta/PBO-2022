import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                // double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
                int hasil = bil1 / bil2;
                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } catch (ArithmeticException e) {
                System.out.println("Pembagian dengan 0 tidak dapat dilakukan");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
// Jawab: 
/* 
   Pada source code Latihan2 ini, program menggunakan exception handling dimana program akan menangkap
   exception kemudian mengulang kembali kode yang ada di dalam try {...}, sehingga program tetap berjalan
   karena ada yang menangani exception. Oleh sebab itu, apabila kita menginputkan huruf pada variabel 
   bil1 atau bil2 program akan tetap berlanjut dengan mengulang kode yang ada di dalam try {...}.
   Sedangkan pada source code sebelumnya (Latihan2) tidak menggunakan exception handling dimana ketika
   kita menginputkan huruf pada variabel bil1 atau bil2 maka akan terjadi InputMismatch dan program akan
   berhenti.

*/

// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!
// Jawab :
/* 
    Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Oleh karena itu kita dapat
    menambahkan code code exception handling untuk menangani pembagian dengan 0 pada source
    code diatas.
    
    catch (ArithmeticException e) {
                System.out.println("Tidak boleh membagi dengan 0 (nol)");
            }

    Selain itu, kita juga perlu mengubah double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
    menjadi int hasil = bil1 / bil2;
    Hal tersebut dikarenakan tipe data double dapat melakukan pembagian dengan 0.
    Sehingga, apabila tidak diubah maka tidak akan ada error dan exception tidak akan terjadi.
*/