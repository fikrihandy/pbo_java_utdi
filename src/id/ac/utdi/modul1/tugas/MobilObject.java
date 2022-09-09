package id.ac.utdi.modul1.tugas;

public class MobilObject {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.setMobil("AB 3313 SY", "Biru", "Mitsubishi", 50);
        mobil1.akselerasi();
        mobil1.belok("kanan");
        mobil1.rem();

        System.out.println("= = = = =");

        Mobil mobil2 = new Mobil();
        mobil2.setMobil("AB 1234 AT", "Merah", "Toyota", 100);
        mobil2.akselerasi();
        mobil2.belok("kiri");
        mobil2.rem();
    }
}
