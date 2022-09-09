package id.ac.utdi.modul1.latihan;

public class ObyekBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setBuku("PBO", 75000, 200);
        buku1.tampil();

        // Tambahkan 2 buah objek dari kelas Buku !
        Buku buku2 = new Buku();
        Buku buku3 = new Buku();

        // Panggil method setBuku() dan tampil()
        buku2.setBuku("Kisah Tanah Jawa", 100000, 642);
        buku2.tampil();
        buku3.setBuku("Belajar JAVA Collection", 75000, 124);
        buku3.tampil();
    }
}
