// Interface Kendaraan
interface Kendaraan {
    void berjalan();
}

// Implementasi pertama
class Mobil implements Kendaraan {
    public void berjalan() {
        System.out.println("Mobil berjalan dengan roda 4.");
    }
}

// Implementasi kedua
class Motor implements Kendaraan {
    public void berjalan() {
        System.out.println("Motor berjalan dengan roda 2.");
    }
}

// Main class
public class PolimorfismeDenganInterfaceLat8 {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil(); // Polimorfisme dengan Interface
        Kendaraan kendaraan2 = new Motor(); // Polimorfisme dengan Interface

        kendaraan1.berjalan();
        kendaraan2.berjalan();
    }
}
