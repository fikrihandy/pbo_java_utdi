package id.ac.utdi.modul5.latihan;

class Film {
    private String judul;
    private String jenis;
    private int durasi;
    // tidak bisa diakses dari kelas lain, karena private

    public void setFilm(String judul, String jenis, int durasi) {
        this.judul = judul;
        this.jenis = jenis;
        this.durasi = durasi;
    }
}

public class TesFilm {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.setFilm("Warkop DKI", "Komedi", 120);
        System.out.println("Judul film :" + film1.judul);
        System.out.println("jenis film : " + film1.jenis);
        System.out.println("dursi : " + film1.durasi);
    }
}
