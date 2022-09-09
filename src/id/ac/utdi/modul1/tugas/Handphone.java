package id.ac.utdi.modul1.tugas;

public class Handphone {
    String manufaktur;
    String tipe;
    String chipset;
    int memory;
    int storage;

    public void setHp(String manufaktur, String tipe, String chipset, int memory, int storage) {
        this.manufaktur = manufaktur;
        this.tipe = tipe;
        this.chipset = chipset;
        this.memory = memory;
        this.storage = storage;
    }

    public void showHp() {
        System.out.println("Handphone = " + manufaktur + " (" + tipe + ")");
        System.out.println("Chipset   = " + chipset);
        System.out.println("Storage   = " + memory + "/" + storage + "\n");
    }
}
