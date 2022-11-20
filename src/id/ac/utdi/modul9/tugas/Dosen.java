package id.ac.utdi.modul9.tugas;

import java.util.GregorianCalendar;

public class Dosen extends Manusia {
    String nidn;

    Dosen(String name, Gender gender, String nidn, String city,
          GregorianCalendar dateOfBirth) {
        super.name = name;
        super.gender = gender;
        this.nidn = nidn;
        super.hometown = city;
        super.dateOfBirth = dateOfBirth.getTime();
    }

    @Override
    public void showData() {
        System.out.println("======== DATA DOSEN ========");
        dataManusia();
        System.out.println("NIDN          = " + nidn);
    }
}
