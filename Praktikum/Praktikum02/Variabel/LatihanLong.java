public class LatihanLong {
    public static void main(String[] args) {
        // long p = 2147483648; -> error
        long p = 2147483648L;
        System.out.println(p);
    }
}


/*

    Apa maksud dari pesan error yang muncul? dan bagaimana
    memperbaiki source code tersebut?
    = Pesan error yang muncul adalah "integer number too large"
    Secara default dalam bahasa java bilangan bulat selalu dianggap 
    bertipe data int. Long sendiri merupakan tipe data bilangan bulat yang 
    digunakan untuk range data yang lebih lebar dari int.
    Nilai default dari long sendiri adalah 0L, dengan demikian untuk
    memperbaiki source code diatas perlu nya ditambahkan 'L' pada akhir
    bilangan untuk menyatakan bahwa tipe data yang digunakan adalah 
    tipe data long.

 */