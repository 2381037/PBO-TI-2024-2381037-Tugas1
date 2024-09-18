package Tugas1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan ukuran tangga (n)");
            int n = scanner.nextInt();

            cetakTangga(n);
    }

     public static void cetakTangga(int n) {
        // Loop luar untuk setiap baris
        for (int i = 1; i <= n; i++) {
            // Loop dalam untuk mencetak '#' sebanyak 'i'
            for (int j = 1; j <= i; j++) {
                System.out.print("#"); // Menggunakan print untuk tetap di baris yang sama
            }
            // Pindah ke baris berikutnya setelah mencetak semua '#' pada baris ini
            System.out.println();
        }
    }
}
