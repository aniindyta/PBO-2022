public class DemoIfElseIf {
    public static void main(String[] args) {
        double IPK = 3.1;

        if(IPK > 3.25) {
            System.out.println("IPK Tinggi");
        } else if(IPK > 2.75 && IPK <= 3.25) {
            System.out.println("IPK Cukup");
        } else {
            System.out.println("IPK Rendah");
        }
    }
}
