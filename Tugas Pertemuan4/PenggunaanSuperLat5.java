// Kelas induk (Superclass)
class Hewan {
    String nama = "Hewan";

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Kelas anak (Subclass) menggunakan `super`
class Kucing extends Hewan {
    String nama = "Kucing";

    void tampilkanNama() {
        System.out.println("Nama di subclass: " + nama);
        System.out.println("Nama di superclass: " + super.nama);
    }

    void makan() {
        super.makan(); // Memanggil method makan() dari superclass
        System.out.println(nama + " makan ikan.");
    }
}

// Kelas utama (Main Class)
public class PenggunaanSuperLat5 {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();

        kucing1.tampilkanNama(); // Menampilkan perbedaan nama di superclass dan subclass
        kucing1.makan();         // Memanggil method makan() dengan `super`
    }
}
