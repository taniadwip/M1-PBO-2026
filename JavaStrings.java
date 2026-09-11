import java.util.Scanner;

public class JavaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca dua kata input (berisi huruf kecil bahasa Inggris)
        if (!sc.hasNext()) {
            sc.close();
            return;
        }
        String A = sc.next();
        String B = sc.next();

        // 1. Menjumlahkan panjang karakter string A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Membandingkan urutan leksikografis menggunakan compareTo()
        // Jika A lebih besar dari B secara leksikografis, kembalian bernilai > 0
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Mengubah huruf pertama menjadi kapital lalu menggabungkan sisa karakternya
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Mencetak kedua string dalam satu baris dipisahkan spasi
        System.out.println(capA + " " + capB);

        sc.close();
    }
}