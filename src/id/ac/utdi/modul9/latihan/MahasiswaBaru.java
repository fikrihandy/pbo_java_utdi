package id.ac.utdi.modul9.latihan;

class MahasiswaBaru extends Mahasiswa {

    public void isiBiodata(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
        System.out.println("nama " + nama + ", nilai : " + nilai);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new MahasiswaBaru();
        mahasiswa.isiBiodata("ahmad", 80);
        mahasiswa.registrasi();
        mahasiswa.testMasuk();
    }
}


