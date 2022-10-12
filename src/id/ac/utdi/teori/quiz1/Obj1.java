package id.ac.utdi.teori.quiz1;

// Contoh 2 objek

public class Obj1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setMerek("Toyota");
        mobil.setThnProduksi(2020);
        mobil.tampil();

        Mobil mobil2 = new Mobil();
        mobil2.setMerek("Honda");
        mobil2.setThnProduksi(2021);
        mobil2.tampil();
    }
}
