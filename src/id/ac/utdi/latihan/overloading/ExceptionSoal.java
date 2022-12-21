package id.ac.utdi.latihan.overloading;

public class ExceptionSoal {
    public static void main(String[] args) {
        int nilai[] = new int[2];
        try {
            nilai[2] = 10;
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Terjadi kesalahan indeks larik");
        } catch (ArithmeticException exp) {
            System.out.println("Terjadi kesalahan");
        } finally {
            System.out.println("Dalam Finally.");
        }
        System.out.println("Akhir program");
    }
}