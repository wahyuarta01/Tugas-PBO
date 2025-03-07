class Kendaraan {
    // Atribut
    String merk;
    String tipe;
    int kecepatan;

    // Konstruktor
    Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Metode untuk menampilkan informasi kendaraan
    void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }

    // Metode untuk menambah kecepatan
    void tambahKecepatan(int km) {
        kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk mengurangi kecepatan
    void kurangiKecepatan(int km) {
        kecepatan = Math.max(0, kecepatan - km);
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk berhenti
    void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }
}

// Main Class untuk Tugas 1
public class Tugaskendaraan1 {
    public static void main(String[] args) {
        Kendaraan ferrari = new Kendaraan("Ferrari", "Mobil Sport", 120);
        ferrari.tampilkanInfo();
        ferrari.tambahKecepatan(50);
        ferrari.kurangiKecepatan(70);
        ferrari.berhenti();
        ferrari.tampilkanInfo();
        
        System.out.println(); // Spasi antara kendaraan
        
        Kendaraan vespa = new Kendaraan("Vespa", "Skuter", 40);
        vespa.tampilkanInfo();
        vespa.tambahKecepatan(20);
        vespa.kurangiKecepatan(30);
        vespa.berhenti();
        vespa.tampilkanInfo();
    }
}
