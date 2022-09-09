package id.ac.utdi.modul2.latihan;

enum Jurusan {
    SistemInformasi, TeknikInformatika, TeknikKomputer
}

public class Mahasiswa {
    int nim;
    String nama;
    Jurusan jurusan;
    String email;
    boolean isMale;

    public void setMahasiswa(int nim, String nama, Jurusan jurusan,
                             String email, boolean isMale) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.email = email;
        this.isMale = isMale;
    }

    public void showMahasiswa() {
        System.out.println("Nama         : " + nama);
        System.out.println("NIM          : " + nim);
        String prodi = switch (jurusan) {
            case SistemInformasi -> "Sistem Informasi";
            case TeknikInformatika -> "Teknik Informatika";
            case TeknikKomputer -> "Teknik Komputer";
        };
        System.out.println("Jurusan      : " + prodi);
        System.out.println("Email        : " + email);
        String jenisKelamin = isMale ? "Laki-laki" : "Perempuan";
        System.out.println("Jenis Kelamin: " + jenisKelamin + "\n");
    }
}
