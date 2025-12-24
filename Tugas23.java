import java.util.Scanner;

public class Tugas23 {

    // ===== Fungsi Rekursif =====
    static int totalRekursif(int n, Scanner sc) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int nilai = sc.nextInt();
            return nilai + totalRekursif(n - 1, sc);
        }
    }

    // ===== Fungsi Iteratif =====
    static int totalIteratif(int n, Scanner sc) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int nilai = sc.nextInt();
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        System.out.println("\nPilih metode perhitungan:");
        System.out.println("1. Rekursif");
        System.out.println("2. Iteratif");
        System.out.print("Pilihan (1/2): ");
        int pilihan = sc.nextInt();

        int total;

        if (pilihan == 1) {
            total = totalRekursif(N, sc);
            System.out.println("\n(Metode Rekursif)");
        } else if (pilihan == 2) {
            total = totalIteratif(N, sc);
            System.out.println("\n(Metode Iteratif)");
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);
    }
}
