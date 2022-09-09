package id.ac.utdi.modul2.tugas;

import java.util.Scanner;

public class PersegiPanjang {
    int panjang;
    int lebar;

    public void cariLuasKeliling() {
        System.out.print("Luas = " + panjang * lebar);
        int keliling = (panjang * 2) + (lebar * 2);
        System.out.print(" | Keliling = " + keliling);
    }

    Scanner input = new Scanner(System.in);

    public int inputPanjang() {
        System.out.print("Masukkan Panjang = ");
        return input.nextInt();
    }

    public int inputLebar() {
        System.out.print("Masukkan Lebar = ");
        return input.nextInt();
    }
}
