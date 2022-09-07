import javax.swing.JOptionPane;

public class LuasLingkaran {
    public static void main(String[] args) {
        final double PI = 3.14159;

        int jariJari;
        double luas;

        jariJari = 7;

        luas = PI * jariJari * jariJari;

        JOptionPane.showMessageDialog(null, "Jari-jari Lingkaran = " +jariJari + "\nLuas Lingkaran = " +luas, "Menghitung Luas", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
