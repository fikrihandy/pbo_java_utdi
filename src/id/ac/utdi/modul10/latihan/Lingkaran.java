package id.ac.utdi.modul10.latihan;

class Lingkaran implements Bangun2D {
    double jarijari;

    Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(jarijari, 2);
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jarijari;
    }
}
