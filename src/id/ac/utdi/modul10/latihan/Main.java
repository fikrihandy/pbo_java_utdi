package id.ac.utdi.modul10.latihan;

public class Main {
    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Keliling Lingkaran = " + lingkaran.hitungKeliling());
        System.out.println("Luas Lingkaran     = " + lingkaran.hitungLuas() + "\n");

        Tabung tabung = new Tabung(21, 24);
        tabung.setWarna("Hijau");
        tabung.tampilInfo();

    }
}
