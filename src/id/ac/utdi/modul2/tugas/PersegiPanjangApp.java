package id.ac.utdi.modul2.tugas;

public class PersegiPanjangApp {
    public static void main(String[] args) {
        // Instansiasi objek
        PersegiPanjang persegiPanjang = new PersegiPanjang();

        // Ambil input user
        persegiPanjang.panjang = persegiPanjang.inputPanjang();
        persegiPanjang.lebar = persegiPanjang.inputLebar();

        // Hitung luas dan keliling
        persegiPanjang.cariLuasKeliling();
    }
}
