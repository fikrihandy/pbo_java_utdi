package id.ac.utdi.modul6.tugas;

public class ObyekBuku {
    public static void main(String[] args) {

        Buku buku1 = new Buku();

        // akses field dengan setter
        buku1.setJudul("Belajar PBO");
        buku1.setHarga(75000);
        buku1.setHalaman(200);

        // method tampil() untuk menampilkan data private
        buku1.tampil();

        Buku buku2 = new Buku();
        buku2.setJudul("Pengenalan Kotlin");
        buku2.setHarga(80000);
        buku2.setHalaman(175);
        buku2.tampil();

    }
}
