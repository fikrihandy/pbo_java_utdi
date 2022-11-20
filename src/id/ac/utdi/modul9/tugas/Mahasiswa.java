package id.ac.utdi.modul9.tugas;

import java.util.GregorianCalendar;

public class Mahasiswa extends Manusia {
    enum Jurusan {SI, TI}

    int nim;
    Jurusan jurusan;


    Mahasiswa(String name, Gender gender, int nim, Jurusan jurusan,
              String city, GregorianCalendar dateOfBirth) {
        super.name = name;
        super.gender = gender;
        this.nim = nim;
        this.jurusan = jurusan;
        super.hometown = city;
        super.dateOfBirth = dateOfBirth.getTime();
    }

    private String getJurusan(Jurusan jurusan) {
        String str = null;
        switch (jurusan) {
            case SI -> str = "Sistem Infromasi";
            case TI -> str = "Teknik Informatika";
        }
        return str;
    }

    @Override
    public void showData() {
        System.out.println("======== DATA MAHASISWA ========");
        dataManusia();
        System.out.println("NIM           = " + nim);
        System.out.println("Jurusan       = " + getJurusan(jurusan));
    }

}
