package id.ac.utdi.modul9.tugas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen(
                "Drs. H. Wahjoe Sardono, M.S.",
                Manusia.Gender.L,
                "0001075603",
                "Jakarta",
                new GregorianCalendar(1981, Calendar.MAY, 23)
        );
        Mahasiswa mahasiswa = new Mahasiswa(
                "Wendy Saputri",
                Manusia.Gender.P,
                215611098,
                Mahasiswa.Jurusan.SI,
                "Wonogiri",
                new GregorianCalendar(2000, Calendar.FEBRUARY, 21)
        );

        dosen.showData(); // Tampilkan data Dosen
        System.out.print('\n'); // Enter
        mahasiswa.showData(); // Tampilkan data Mahasiswa
    }
}
