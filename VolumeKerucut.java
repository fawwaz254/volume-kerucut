import java.util.Scanner;

/**
 * The type Volume kerucut.
 */
public class VolumeKerucut {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        double r, tinggi, volume;

        System.out.print("Masukkan jari-jari alas : ");
        r = scanner.nextDouble();

        System.out.print("Maskan tinggi : ");
        tinggi = scanner.nextDouble();

        volume = volume(r, tinggi);

        System.out.format("Volume = %.2f\n", volume);
    }

    /**
     *
     * @param r jari"
     * @param tinggi adalah tinggi
     * @return untuk mengembalikan nilai volume 
     */
    private static double volume(double r, double tinggi) {
        return (1.0 / 3.0) * (3.14 * r * r) * tinggi;
    }
}