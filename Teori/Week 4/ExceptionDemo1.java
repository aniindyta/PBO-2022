import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */

 /*  JAWAB : 
 -  Program tidak dapat dijalankan dengan output yang muncul adalah
    Exception in thread "main" java.util.InputMismatchException      
            at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            at java.base/java.util.Scanner.next(Scanner.java:1594)   
            at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:10)
    Maksud dari output tersebut adalah bahwa terdapat kesalahan input atau input missmatch.
    Hal tersebut disebabkan karena input yang dimasukkan tidak sesuai dengan tipe data.

*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */

 /*  JAWAB :
 - Output yang muncul ialah :
   5 / 0 = Infinity
 - Maksud dari output tersebut adalah karena tipe data variabel 'hasil' merupakan double maka dimungkinkan terjadinya pembagian
   dengan nol (0). Pembagian dengan 0 pada tipe data double ini akan menghasilkan Infinity.
   Berbeda hal nya apabila tipe data yang digunakan merupakan integer. Pembagian dengan 0 pada tipe data
   integer dapat membuat program error arithmatic by zero.
*/