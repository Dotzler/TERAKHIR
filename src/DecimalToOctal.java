import java.util.Scanner;
/**
 * Program ini mengkonversi bilangan desimal menjadi bentuk oktal.
 * Menggunakan dua metode untuk menghitung konversi ke oktal.
 */
public class DecimalToOctal {

    /**
     * Fungsi utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        int decimalNumber = input.nextInt();

        String octal = decimalToOctal(decimalNumber);
        String binary = decimalToBinary(decimalNumber);

        System.out.println("Hasil konversi ke oktal : " + octal);
        System.out.println("Hasil konversi ke binary : " + binary);

        input.close();
    }

    /**
     * Metode ini mengkonversi bilangan desimal menjadi bilangan oktal.
     *
     * @param decimalNumber Bilangan desimal yang akan dikonversi.
     * @return String yang mewakili bilangan oktal.
     */
    public static String decimalToOctal(int decimalNumber) {
        StringBuilder octal = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            octal.insert(0, remainder);
            decimalNumber = decimalNumber / 8;
        }
        return octal.toString();
    }

    public static String decimalToBinary(int decimalNumber) {
        StringBuilder octal = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            octal.insert(0, remainder);
            decimalNumber = decimalNumber / 2;
        }
        return octal.toString();
    }
}
