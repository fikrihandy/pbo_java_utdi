package id.ac.utdi.modul6.latihan;

public class SepedaMotor {
    public String merek;
    public String tipe;
    private String platNomor;
    private int nomorSeri;

    SepedaMotor(String merek, String tipe) {
        this.merek = merek;
        this.tipe = tipe;
    } // Constructor untuk attribute public

    public String getPlatNomor() {
        return platNomor;
    } // Getter untuk enkapsulasi attribute private

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    } // Setter untuk enkapsulasi attribute private

    public int getNomorSeri() {
        return nomorSeri;
    }

    public void setNomorSeri(int nomorSeri) {
        this.nomorSeri = nomorSeri;
    }

    public void show() {
        System.out.println(merek + " - " + tipe);
    }
}
