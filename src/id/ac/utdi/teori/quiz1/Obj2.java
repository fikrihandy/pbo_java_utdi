package id.ac.utdi.teori.quiz1;

// // Contoh 2 objek dibuat dengan konstruktor

public class Obj2 {
    public static void main(String[] args) {
        MobilDenganKonstruktor mobil = new MobilDenganKonstruktor(
                "Mercedes",
                2022
        );
        mobil.tampil();

        MobilDenganKonstruktor mobil2 = new MobilDenganKonstruktor(
                "BMW",
                2019
        );
        mobil2.tampil();
    }
}
