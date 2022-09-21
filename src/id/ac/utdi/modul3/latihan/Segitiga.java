package id.ac.utdi.modul3.latihan;

public class Segitiga {
    int alas;
    int tinggi;
    int s1;
    int s2;
    int s3;

    public void setInput(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void setInput(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void hitungLuas(int alas, int tinggi) {
        System.out.println("Diketahui alas = " + alas + ", tinggi = " + tinggi);
        System.out.println("L = " + 0.5 * alas * tinggi);
    }

    public void hitungLuas(int s1, int s2, int s3) {
        double s = 0.5 * (s1 + s2 + s3);
        double hitung = s * (s - s1) * (s - s2) * (s - s3);
        System.out.println("Diketahui 3 sisi dengan nilai " + s1 + ", " + s2 + ", dan " + s3);
        System.out.println("L = √" + hitung);
        System.out.println("L = " + Math.sqrt(hitung));
    }
}
