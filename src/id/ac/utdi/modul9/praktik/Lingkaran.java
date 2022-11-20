package id.ac.utdi.modul9.praktik;

class Lingkaran extends Bentuk {
    int radius;

    public Lingkaran(int r) {
        radius = r;
    }

    public String getBentuk() {
        return "Bentuk Lingkaran";
    }

    public double HitungLuas() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Bentuk geometri = new BujurSangkar(6, 4);
        System.out.println("Luas Bujur Sangkar = " + (int) geometri.HitungLuas());
        Bentuk lingkaran = new Lingkaran(7);
        System.out.printf("Luas Lingkaran = %.2f", lingkaran.HitungLuas());
    }
}

