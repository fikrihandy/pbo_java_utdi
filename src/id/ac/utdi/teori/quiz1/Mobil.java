package id.ac.utdi.teori.quiz1;

// Menggunakan Default Constructor

public class Mobil {
    // deklarasi properti
    private String merek;
    private int thnProduksi;

    // method mutator
    public void setMerek(String merek) {
        this.merek = merek;
    }

    // method menampilkan data
    public void tampil() {
        System.out.println("Merek          = " + getMerek());
        System.out.println("Tahun Produksi = " + getThnProduksi() + "\n");
    }

    public void setThnProduksi(int thnProduksi) {
        this.thnProduksi = thnProduksi;
    }

    // method asesor

    public String getMerek() {
        return merek;
    }

    public int getThnProduksi() {
        return thnProduksi;
    }
}
