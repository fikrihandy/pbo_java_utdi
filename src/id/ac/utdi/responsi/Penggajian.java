package id.ac.utdi.responsi;

import java.text.NumberFormat;
import java.util.Locale;

// Nama  : ABDULLAH FIKRI HANDI SAPUTRA
// NIM   : 215611098
// Prodi : SISTEM INFORMASI (K1)
// Responsi - Pemrograman Berorientasi Objek

abstract class Pegawai {
    int nip;
    String nama;

    abstract void setJabatan(String jabatan);
}

interface GajiPokok {
    int gajiPokok();
}

interface Bonus {
    int bonus();
}

public class Penggajian extends Pegawai implements GajiPokok, Bonus {
    private String jabatan;
    private String bulan;

    Penggajian(String bulan, int nip, String nama, String jabatan) {
        this.bulan = bulan;
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int gajiPokok() {
        if (jabatan == "Supervisor") {
            return 5000000;
        } else if (jabatan == "Manager") {
            return 7000000;
        } else {
            return 0;
        }
    }

    public int bonus() {
        if (jabatan == "Supervisor") {
            return gajiPokok() * 2;
        } else if (jabatan == "Manager") {
            return gajiPokok() * 3;
        } else {
            return 0;
        }
    }

    private int totalGaji() {
        return gajiPokok() + bonus();
    }

    public void tampil() {
        System.out.println("Gaji bulan = " + bulan);
        System.out.println("NIP        = " + nip);
        System.out.println("Nama       = " + nama);
        System.out.println("Jabatan    = " + jabatan);
        System.out.println("Gaji Pokok = Rp " + NumberFormat.getNumberInstance(Locale.US).format(gajiPokok()));
        System.out.println("Bonus      = Rp " + NumberFormat.getNumberInstance(Locale.US).format(bonus()));
        System.out.println("Total Gaji = Rp " + NumberFormat.getNumberInstance(Locale.US).format(totalGaji()));
        System.out.println("===========================\n");
    }
}

class Main {
    public static void main(String[] args) {
        Penggajian spv = new Penggajian("Desember 2022", 853114, "Andre Susanto", "Supervisor");
        spv.tampil();

        Penggajian mgr = new Penggajian("Januari 2023", 853115, "Abdull Fikri", "Manager");
        mgr.tampil();
    }
}