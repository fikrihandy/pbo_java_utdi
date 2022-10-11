package id.ac.utdi.modul6.latihan;

public class Main {
    public static void main(String[] args) {
        SepedaMotor sepedaMotor1 = new SepedaMotor("Yamaha", "Mio M3 125");

        // menggunakan setter untuk mengubah field private
        sepedaMotor1.setPlatNomor("AB 1234 CD");
        sepedaMotor1.setNomorSeri(75937552);

        sepedaMotor1.show(); // run show method

        // menggunakan getter untuk mengakses field private
        System.out.println("Plat = " + sepedaMotor1.getPlatNomor());
        System.out.println("Seri = " + sepedaMotor1.getNomorSeri() + "\n");

        SepedaMotor sepedaMotor2 = new SepedaMotor("Suzuki", "Thunder 125");
        sepedaMotor2.setPlatNomor("AD 4321 BC");
        sepedaMotor2.setNomorSeri(90765837);
        sepedaMotor2.show();
        System.out.println("Plat = " + sepedaMotor2.getPlatNomor());
        System.out.println("Seri = " + sepedaMotor2.getNomorSeri());
    }
}
