abstract class Kendaraan {
    String nama;
    
    // Konstruktor
    public Kendaraan(String nama) {
        this.nama = nama;
    }
    
    // Method abstrak (harus diimplementasikan oleh subclass)
    abstract void bergerak();
    
    // Method konkret
    public void info() {
        System.out.println(nama + " adalah kendaraan.");
    }
}

// Subclass Mobil
class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama);
    }
    
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan roda.");
    }
}

// Subclass Kapal
class Kapal extends Kendaraan {
    public Kapal(String nama) {
        super(nama);
    }
    
    @Override
    void bergerak() {
        System.out.println(nama + " bergerak di air.");
    }
}

// Main class
public class contoh1pertemuan3 {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan kapal = new Kapal("Titanic");
        
        mobil.info();
        mobil.bergerak();
        
        kapal.info();
        kapal.bergerak();
    }
}
