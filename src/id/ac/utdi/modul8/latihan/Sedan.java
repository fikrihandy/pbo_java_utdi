package id.ac.utdi.modul8.latihan;

public class Sedan extends Mobil {
    protected String spec;

    public Sedan(String spec, int kec) {
        super(kec);
        this.spec = spec;
        System.out.println(spec);
    }

    public Sedan(int kecmaks, String namaken, String spec) {
        super(kecmaks, namaken);
        this.spec = spec;
    }

    @Override
    public void PrintInfoMobil() {
        super.PrintInfoMobil();
        System.out.println("Kapasitas : " + spec);
    }

    public void PrintInfoSedan() {
        System.out.println("kecepatan maksimal : " + kecmaks);
        System.out.println("Nama Kendaraan : " + namaken);
        System.out.println("Spec: " + spec);
    }
}
