package id.ac.utdi.modul1.latihan;

class Buku {
    String judul;
    int harga;
    int halaman;

    public void setBuku(String judul, int harga, int halaman) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judul buku :" + judul);
        System.out.println("Harga buku : " + harga);
        System.out.println("Jumlah halaman : " + halaman);
    }
}
