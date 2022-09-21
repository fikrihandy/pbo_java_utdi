package id.ac.utdi.modul3.latihan;

public class Calculation2 {
    private int a, b;
    private double c, d;

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double c, double d) {
        System.out.println(c + d);
    }

    void sum(float e, float f) {
        System.out.println(e + f);
    }

    public static void main(String args[]) {
        Calculation2 obj = new Calculation2();
        obj.sum(10.5, 10.5);
        obj.sum(20, 20);
        obj.sum(23.5f, 7.5f);
    }
}
