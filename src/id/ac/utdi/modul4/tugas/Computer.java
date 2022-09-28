package id.ac.utdi.modul4.tugas;

public class Computer {
    String motherboard;
    String processor;
    int ram;
    int ssd;
    String vga;

    public Computer(
            String motherboard,
            String processor,
            int ram,
            int ssd,
            String vga
    ) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
        this.vga = vga;
    }

    public void computerTurnOn() {
        System.out.println("Computer " + processor + " (" + motherboard + ") dinyalakan!");
    }

    public void computerTurnOff() {
        System.out.println("Computer " + processor + " (" + motherboard + ") dimatikan!");
    }
}
