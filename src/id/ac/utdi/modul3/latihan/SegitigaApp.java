package id.ac.utdi.modul3.latihan;

public class SegitigaApp {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        // diketahui alas dan tinggi
        // https://www.detik.com/jabar/berita/d-6188704/rumus-luas-segitiga-cara-menghitung-jenis-dan-contohnya
        segitiga.setInput(7, 6);
        segitiga.hitungLuas(segitiga.alas, segitiga.tinggi);

        System.out.println("\n==================\n");

        // diketahui 3 sisi
        // https://jagostat.com/matematika-dasar/luas-segitiga-dengan-aturan-trigonometri
        segitiga.setInput(16, 14, 10);
        segitiga.hitungLuas(segitiga.s1, segitiga.s2, segitiga.s3);
    }
}
