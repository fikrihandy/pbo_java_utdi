package id.ac.utdi.modul10.latihan;

class Tabung extends Lingkaran implements Bangun3D, Pola {
    double tinggi;
    Lingkaran alas;
    String warna;

    Tabung(double jarijari, double tinggi) {
        super(jarijari);
        this.tinggi = tinggi;
        this.alas = new Lingkaran(jarijari);
    }

    public double hitungVolume() {
        return alas.hitungLuas() * tinggi;
    }

    public void tampilInfo() {
        System.out.println("Alas   = " + alas.hitungLuas());
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Volume = " + hitungVolume());
        System.out.println("Warna  = " + getWarna());
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
}
