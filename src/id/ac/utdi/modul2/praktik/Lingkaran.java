package id.ac.utdi.modul2.praktik;

public class Lingkaran {
    final double phi = 3.14; // konstanta
    double jari; // atribut

    public void setJari(double jari0) {
        this.jari = jari0;
    }

    public double jari() {
        return (jari);
    }

    public double luas() {
        double luas0;
        luas0 = phi * jari * jari;
        return (luas0);
    }

    public void tampil() {
        System.out.println("jari jari: " + jari);
        System.out.println("luas: " + luas());
    }
}
