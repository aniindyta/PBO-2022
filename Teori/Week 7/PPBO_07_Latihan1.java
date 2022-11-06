// Nama : Anindita Putri Kirani
// NIM  : M0521012

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PPBO_07_Latihan1 {
    // method untuk user menginputkan teks melalui keyboard
    public String ketikTeks() {
        System.out.println("Ketik kalimat yang akan disimpan : ");
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        scan.close();
        return str1;
    }
    
    // untuk menyimpan teks yang diketik user ke dalam file
    public void simpanTeks(String teks) {
        // set up file and stream
        File outFile = new File("sample3.data"); 
        FileOutputStream outFileStream;
        try {
            outFileStream = new FileOutputStream(outFile);
            PrintWriter outStream = new PrintWriter(outFileStream);
            outStream.print(teks);
            outStream.close();
            System.out.println("File berhasil disimpan!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }

    public static void main(String[] args) {
        PPBO_07_Latihan1 IT = new PPBO_07_Latihan1();
        String kalimat = IT.ketikTeks();
        IT.simpanTeks(kalimat);
    }
}

/*  PPBO_07_Latihan1

    Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya!

    Jawab :
    Apabila source code diatas dijalankan maka akan ada perintah untuk mengetikkan kalimat. Setelah user 
    menginputkan kalimat maka kalimat tersebut akan disimpan ke dalam file dengan nama "sample3.data". 
    Dengan demikian apabila file "sample3.data" dibuka maka isinya merupakan kalimat yang telah user inputkan 
    sebelumnya.

    Contohnya apabila user menginputkan kalimat "Hello Future - NCT DREAM" maka isi dari file "sample3.data"
    juga akan menampilkan hasil "Hello Future - NCT DREAM".

 */