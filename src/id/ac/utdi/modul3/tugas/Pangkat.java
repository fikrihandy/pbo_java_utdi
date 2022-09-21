package id.ac.utdi.modul3.tugas;

public class Pangkat {
    int input;
    int pangkat;

    public void hitungPangkat(int input, int pangkat) {
        this.input = input;
        this.pangkat = pangkat;
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= input;
        }
        System.out.println(input + " pangkat " + pangkat + " = " + hasil);
    }
}

class Main {
    public static void main(String[] args) {
        Pangkat pangkat = new Pangkat();
        pangkat.hitungPangkat(2, 5);
        pangkat.hitungPangkat(3, 2);
        pangkat.hitungPangkat(5, 3);
        pangkat.hitungPangkat(7, 0);

    }
}
