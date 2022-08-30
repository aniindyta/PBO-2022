public class SegiTiga {
    int Alas = 3;
    int Tinggi = 4;
    int SisiMiring = 5;

    public static void main(String[] args) {
        SegiTiga segitiga = new SegiTiga();

        System.out.println("              SEGITIGA");
        System.out.println("-------------------------------------");
        System.out.println("Alas                : " +segitiga.Alas);
        System.out.println("Tinggi              : " +segitiga.Tinggi);
        System.out.println("Sisi Miring         : " +segitiga.SisiMiring);
        System.out.println("Luas Segitiga       : " +segitiga.HitungLuas());
        System.out.println("Keliling Segitiga   : " +segitiga.HitungKeliling());
    }

    public Double HitungLuas() {
        Double Luas = 0.5 * this.Alas * this.Tinggi;
        return Luas;
    }

    public Double HitungKeliling() {
        Double Keliling = Double.valueOf(this.Alas) + Double.valueOf(this.SisiMiring) + Double.valueOf(this.Tinggi);
        return Keliling;
    }
}