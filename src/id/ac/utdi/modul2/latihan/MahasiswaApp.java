package id.ac.utdi.modul2.latihan;

public class MahasiswaApp {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setMahasiswa(
                215611098,
                "Abdullah Fikri",
                Jurusan.SistemInformasi,
                "abdullah.fikri@students.utdi.ac.id",
                true
        );
        mahasiswa.showMahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setMahasiswa(
                215611099,
                "Anya",
                Jurusan.TeknikKomputer,
                "anya@example.id",
                false
        );
        mahasiswa2.showMahasiswa();
    }
}
