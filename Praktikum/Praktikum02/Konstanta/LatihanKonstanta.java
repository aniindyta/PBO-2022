public class LatihanKonstanta {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";

    public static void main(String[] args) {
        // KURS_DOLLAR = 13500; -> Penyebab error

        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

/* 
 
    Apa yang salah dengan source code tersebut?
    KURS_DOLLAR yang merupakan variabel final ingin diubah nilainya. 
    Padahal variable final sendiri hanya bisa diberi nilai (di-assign)
    satu kali saja.

    Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi
    variabel tersebut?
    Static sebelum keyword final merupakan perintah khusus yang memungkinkan 
    sebuah variabel ataupun method dapat diakses tanpa harus menginisiasi objek 
    terlebih dahulu, tapi cukup dengan menulis nama class saja. 
    Deklarasi static variabel ini tiap wujud dari class hanya akan menunjuk
    ke satu static variabel yang sama sehingga menghemat memory. 

*/