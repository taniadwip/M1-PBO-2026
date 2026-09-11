import java.util.Scanner;

/**
 * Program untuk menentukan tipe data primitif bilangan bulat (byte, short, int, long)
 * yang mampu menampung nilai input tertentu.
 */
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah kasus uji (T)
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                // Mencoba membaca nilai sebagai tipe long (tipe integer primitif terbesar di Java)
                long n = scanner.nextLong();

                
                System.out.println(n + " can be fitted in:");

                // Pemeriksaan rentang nilai byte (-128 s.d. 127)
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                // Pemeriksaan rentang nilai short (-32.768 s.d. 32.767)
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                // Pemeriksaan rentang nilai int (-2.147.483.648 s.d. 2.147.483.647)
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // Nilai n pasti muat di tipe long karena lolos scanner.nextLong()
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                // Jika nilai input melebihi rentang long, Scanner akan melempar InputMismatchException
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}