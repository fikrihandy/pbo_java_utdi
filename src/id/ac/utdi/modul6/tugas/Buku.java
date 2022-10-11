package id.ac.utdi.modul6.tugas;

class Buku {
    private String judul;
    private int harga;
    private int halaman;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judul buku :" + getJudul());
        System.out.println("Harga buku : " + getHarga());
        System.out.println("Jumlah halaman : " + getHalaman() + "\n");
    } // method tampil() untuk menampilkan method dengan getter
}
