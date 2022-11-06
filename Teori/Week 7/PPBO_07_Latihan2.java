// Nama : Anindita Putri Kirani
// NIM  : M0521012

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PPBO_07_Latihan2 {
    public String ketikTeks() {
        System.out.println("Ketik kalimat yang akan disimpan : ");
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        scan.close();
        return str1;
    }
    
    public void simpanTeks(String teks) {
        File outFile = new File("sample4.data");
        FileOutputStream outFileStream;
        try {
            outFileStream = new FileOutputStream(outFile);
            DataOutputStream outStream = new DataOutputStream(outFileStream);
            outStream.writeBytes(teks);
            outStream.close();
            System.out.println("File berhasil disimpan!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PPBO_07_Latihan2 IT = new PPBO_07_Latihan2();
        String kalimat = IT.ketikTeks();
        IT.simpanTeks(kalimat);
    }
}

/*  PPBO_07_Latihan2

    1. Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya!

    Jawab :
    Apabila source code diatas dijalankan maka akan ada perintah untuk mengetikkan kalimat. Setelah user 
    menginputkan kalimat maka kalimat tersebut akan disimpan ke dalam file dengan nama "sample4.data". 
    Dengan demikian apabila file "sample4.data" dibuka maka isinya merupakan kalimat yang telah user inputkan 
    sebelumnya.

    Contohnya apabila user menginputkan kalimat "Dear DREAM - NCT DREAM" maka isi dari file "sample3.data"
    juga akan menampilkan hasil "Dear DREAM - NCT DREAM".

    Dapat dikatakan bahwa inti dari program ini sama seperti pada PPBO_07_Latihan1


    2. Perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes()

    Jawab :
    PrintWriter.write() dan DataOutputStream.writeBytes() merupakan contoh dari operasi I/O dengan menggunakan streams. 
    Streams sendiri merupakan abstraksi dari sesuatu yang digunakan untuk menulisa atau menghasilkan serta
    mendapatkan suatu informasi. Secara umum 'stream' dalam Java dibagi menjadi dua bagian besar yaitu Byte Stream
    dan Character Stream. Byte Stream cocok digunakan untuk operasi I/O data biner (byte). Sedangkan Character 
    Stream digunakan untuk menangani operasi I/O yang menggunakan karakter. Dalam beberapa kasus, seperti menangani 
    operasi I/O yang menulis dan membaca data yang berupa String, penggunaan character Stream ini lebih effisien. 

    PrintWriter merupakan contoh dari Character Stream. PrintWriter.write() ini bekerja dengan cara mengubah data 
    primitif (int, float, char, dll) ke dalam format teks. PrintWriter ini juga menambahkan method untuk memudahkan 
    proses menulis ke suatu output. Method yang ditambahkan yaitu print() atau println(). Dengan demikian dapat 
    dikatakan bahwa karakter yang diinputkan user pada program ini akan diubah formatnya ke dalam format teks. 

    Sedangkan, DataOutputStream merupakan contoh dari Byte Stream. DataOutputStream.writeBytes() ini bekerja dengan cara
    menuliskan byte yang mewakili tipe data primitif (int, float, char, dll). Dengan demikian dapat dikatakan bahwa tiap 
    karakter yang diinputkan user pada program ini akan ditulis ke dalam urutan bytes.

    Kesimpulannya adalah, PrintWriter lebih cocok digunakan untuk data teks sedangkan DataOutputStream lebih cocok 
    digunakan untuk data biner.

 */