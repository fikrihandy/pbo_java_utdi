package id.ac.utdi.latihan.overloading;

public interface Mahasiswa {
    private int jumlahSks();

    protected void jadwalKuliah();
}

// ERROR, PRIVATE WAJIB NON-ABSTRACT METHOD
// ERROR, PROTECTED TIDAK DPERBOLEHKAN DI INTERFACE