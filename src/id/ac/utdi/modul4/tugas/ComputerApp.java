package id.ac.utdi.modul4.tugas;

public class ComputerApp {
    public static void main(String[] args) {

        // pembuatan objek dengan constructor

        Computer computer = new Computer(
                "ASrock A320M",
                "AMD Ryzen 3 3200G",
                16,
                256,
                "Radeon Vega 8"
        );

        //method

        computer.computerTurnOn();
        computer.computerTurnOff();
    }
}
