package id.ac.utdi.modul1.tugas;

public class Mobil {
    String nomorPlat;
    String warna;
    String manufaktur;
    int kecepatan;

    public void setMobil(String nomorPlat, String warna, String manufaktur, int kecepatan) {
        this.nomorPlat = nomorPlat;
        this.warna = warna;
        this.manufaktur = manufaktur;
        this.kecepatan = kecepatan;
    }

    public void akselerasi() {
        System.out.println("Mobil " + manufaktur + " berjalan dengan kecepatan " + kecepatan + "km/h");
    }

    public void belok(String arah) {
        System.out.println("Mobil " + manufaktur + " belok " + arah);
    }

    public void rem() {
        System.out.println("Mobil " + manufaktur + " direm");
    }
}
