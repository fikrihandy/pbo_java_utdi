package id.ac.utdi.modul9.latihan;

abstract class Mahasiswa {
    String nama;
    int nilai;

    public abstract void isiBiodata(String nama, int nilai);

    public void registrasi() {
        System.out.println("nama " + nama + " telah melakukan registrasi");
    }


    public void testMasuk() {
        System.out.println("nilai test anda " + nilai);
    }
}

