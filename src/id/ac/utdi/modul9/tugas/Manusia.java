package id.ac.utdi.modul9.tugas;

import java.text.SimpleDateFormat;
import java.util.Date;


abstract class Manusia {
    enum Gender {L, P}

    String name;
    Gender gender;
    String hometown;
    Date dateOfBirth;

    abstract public void showData();

    String getGender(Gender gender) {
        String str = null;
        switch (gender) {
            case L -> str = "Laki-laki";
            case P -> str = "Perempuan";
        }
        return str;
    }

    String getDate(Date dateOfBirth) {
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        return format1.format(dateOfBirth.getTime());
    }

    public void dataManusia() {
        System.out.println("Nama          = " + name);
        System.out.println("Jenis Kelamin = " + getGender(gender));
        System.out.println("Tempat Lahir  = " + hometown);
        System.out.println("Tanggal Lahir = " + getDate(dateOfBirth));
    }
}
