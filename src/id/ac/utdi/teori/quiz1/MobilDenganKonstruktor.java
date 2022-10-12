package id.ac.utdi.teori.quiz1;

// Menggunakan Konstruktor dengan Parameter

public class MobilDenganKonstruktor {
    // deklarasi properti
    private String merek;
    private int thnProduksi;

    // constructor
    MobilDenganKonstruktor(String merek, int thnProduksi) {
        this.merek = merek;
        this.thnProduksi = thnProduksi;
    }

    // method mutator
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setThnProduksi(int thnProduksi) {
        this.thnProduksi = thnProduksi;
    }

    // method menampilkan data
    public void tampil() {
        System.out.println("Merek          = " + getMerek());
        System.out.println("Tahun Produksi = " + getThnProduksi() + "\n");
    }

    // method asesor
    public String getMerek() {
        return merek;
    }

    public int getThnProduksi() {
        return thnProduksi;
    }
}
