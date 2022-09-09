package id.ac.utdi.modul1.tugas;

public class HandphoneObject {
    public static void main(String[] args) {
        Handphone handphone1 = new Handphone();
        handphone1.setHp(
                "Xiaomi",
                "Redmi Note 10 5G",
                "Dimensity 700",
                8,
                128
        );
        handphone1.showHp();

        Handphone handphone2 = new Handphone();
        handphone2.setHp(
                "ASUS",
                "Zenfone Max Pro M1",
                "Snapdragon 636",
                4,
                64
        );
        handphone2.showHp();
    }
}
