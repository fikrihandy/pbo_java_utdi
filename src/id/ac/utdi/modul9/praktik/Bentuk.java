package id.ac.utdi.modul9.praktik;

abstract class Bentuk {
    protected int panjang;
    protected int lebar;

    public String getBentuk() {
        return "bentuk dasar";
    }

    public abstract double HitungLuas();
}

class BujurSangkar extends Bentuk {
    public BujurSangkar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public String getBentuk() {
        return "bentuk bujur sangkar";
    }

    public double HitungLuas() {
        return panjang * lebar;
    }
}

class Segitiga extends Bentuk {
    public Segitiga(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public String getBentuk() {
        return "bentuk segitiga";
    }

    public double HitungLuas() {
        return (double) (panjang * lebar) / 2;
    }
}

class TestAbstrak2 {
    public static void cetakLuasBentuk(Bentuk btk) {
        System.out.println(btk.getBentuk() + " dengan luas :" + btk.HitungLuas());
    }

    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar(10, 20);
        Segitiga st = new Segitiga(5, 10);
        cetakLuasBentuk(bs);
        cetakLuasBentuk(st);
    }
}
