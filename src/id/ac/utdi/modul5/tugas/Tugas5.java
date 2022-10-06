package id.ac.utdi.modul5.tugas;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Tugas5 {
    private static void luasLingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Hitung Luas Lingkaran");
        System.out.print("Masukkan Jari-jari (r) = ");
        double r = scanner.nextDouble();
        double a = Math.PI * Math.pow(r, 2);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Luas = " + decimalFormat.format(a));
    }

    public static void main(String[] args) {
        while (true) {
            luasLingkaran();
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Hitung lagi ? (y/n) >> ");
            String again = scanner2.next();
            if (again.equalsIgnoreCase("n")) {
                System.out.println("Keluar dari aplikasi...");
                break;
            } else if (again.equalsIgnoreCase("y")) {
                System.out.println("\n");
            }
        }
    }
}
