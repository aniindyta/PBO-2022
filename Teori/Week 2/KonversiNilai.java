import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("> Masukkan nilai anda dalam skala 100 : ");
        int nilai = input.nextInt();

        System.out.println("\n> Nilai anda dalam skala 4 : ");
        if(nilai < 55) {
            System.out.println("E (0.00)");
        } else if (nilai <= 59) {
            System.out.println("D (1.00)");
        } else if (nilai <= 64) {
            System.out.println("C (2.00)");
        } else if (nilai <= 69) {
            System.out.println("C+ (2.70)");
        } else if (nilai <= 74) {
            System.out.println("B (3.00)");
        } else if (nilai <= 79) {
            System.out.println("B+ (3.30)");
        } else if (nilai <= 84) {
            System.out.println("A- (3.70)");
        } else if (nilai >= 85 && nilai <= 100) {
            System.out.println("A (4.00)");
        } else {
            System.out.println("Mohon maaf, nilai yang anda masukkan tidak ada\ndalam rentang nilai yang tersedia.");
        }
    }
}