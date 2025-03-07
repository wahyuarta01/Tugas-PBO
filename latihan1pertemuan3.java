// Abstract class Kendaraan
abstract class Kendaraan {
    String nama;
    int jumlahRoda;

    // Konstruktor
    public Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }

    // Method konkret
    public void info() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }

    // Method abstrak
    abstract void bergerak();
}

// Subclass Mobil
class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama, 4);
    }
    
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Subclass SepedaMotor
class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama) {
        super(nama, 2);
    }
    
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Interface KendaraanListrik
interface KendaraanListrik {
    void isiDaya();
}

// Subclass MobilListrik
class MobilListrik extends Mobil implements KendaraanListrik {
    public MobilListrik(String nama) {
        super(nama);
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }
    
    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

// Main Class
public class latihan1pertemuan3 {
    public static void main(String[] args) {
        Kendaraan toyota = new Mobil("Toyota");
        Kendaraan honda = new SepedaMotor("Honda");
        KendaraanListrik tesla = new MobilListrik("Tesla Model 3");
        
        // Output untuk abstract class
        toyota.info();
        toyota.bergerak();
        
        honda.info();
        honda.bergerak();
        
        System.out.println(); // Spasi pemisah
        
        // Output untuk interface
        MobilListrik mobilListrik = (MobilListrik) tesla;
        mobilListrik.info();
        mobilListrik.bergerak();
        mobilListrik.isiDaya();
    }
}
