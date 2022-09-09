package id.ac.utdi.modul1.latihan;

class Pegawai {
    int nomorPegawai;
    String nama;
    boolean isTetap;

    public void setPegawai(int nomorPegawai, String nama, boolean isTetap) {
        this.nomorPegawai = nomorPegawai;
        this.nama = nama;
        this.isTetap = isTetap;
    }

    public void tampilkan() {
        System.out.println("Nama          = " + nama);
        System.out.println("Nomor Pegawai = " + nomorPegawai);
        String status = isTetap ? "Pegawai Tetap" : "Pegawai Kontrak";
        System.out.println("Status        = " + status + "\n");
    }
}

class PegawaiObject {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();

        pegawai1.setPegawai(101, "Abdullah", true);
        pegawai1.tampilkan();

        pegawai2.setPegawai(211, "Winda", false);
        pegawai2.tampilkan();
    }
}







