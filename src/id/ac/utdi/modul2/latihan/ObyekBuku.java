package id.ac.utdi.modul2.latihan;

public class ObyekBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setBuku(
                "PBO",
                75000,
                200,
                "Joko Sulastro",
                "CV. Bersinar");
        buku1.tampil();

        Buku buku2 = new Buku();
        buku2.setBuku(
                "Kisah Tanah Jawa",
                100000,
                642,
                "Dodo Margiono",
                "CV. Bersatu");
        buku2.tampil();
    }
}
