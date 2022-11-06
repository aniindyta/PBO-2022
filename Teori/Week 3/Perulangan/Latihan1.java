public class Latihan1 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        // for (int i = 1; i < 6; i++) {
        //     System.out.println("Elemen ke-" + i + " = " + arr[i]);
        // }

        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

/*  Jawab: 
    Perulangan sebelumnya belum tepat dikarenakan indeks array yang dimulai dari 1.
    Indeks array pada java sendiri dimulai dari 0. Oleh sebab itu pada perulangan
    sebelumnya angka '5' tidak tercetak dikarenakan angka '5' sendiri merupakan indeks
    ke-0 sehingga ketika kode dijalankan akan menimbulkan error karena terjadi kelebihan 
    jumlah indeks yang dimiliki array.

    Untuk memperbaiki nya dapat dilakukan dengan 2 cara yaitu mengubah nilai dari indeks
    array yang sebelumnya i = 1 menjadi 1 = 0 dengan kondisi i < 5, seperti berikut ini
    
    for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Elemen ke-" + i + " = " + arr[i]);
        }
    
    Cara yang kedua bisa dilakukan apabila memang ingin menganggap bahwa indeks ke-0 merupakan elemen ke-1.
    Hal ini dilakukan ketika akan dilakukan print ke layar, variabel i ditambahkan dengan 1 menjadi seperti berikut,

    for (int i = 1; i < 6; i++) {
        System.out.println("Elemen ke-" + (i+1) + " = " + arr[i]);
    }

*/