package id.ac.utdi.modul8.latihan;

public class SedanApp {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(
                200,
                "Toyota",
                "Kapasitas 4 penumpang");
        System.out.print("Method PrintInfoMobil() ");
        System.out.print("@override\n\n");
        sedan.PrintInfoMobil();

        System.out.println("\nMethod PrintInfoSedan()\n");
        sedan.PrintInfoSedan();
    }
}
