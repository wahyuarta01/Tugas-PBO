// Kelas Kalkulator dengan metode overloading
class Kalkulator {

    // Metode pertama: Menjumlahkan dua angka
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode kedua: Menjumlahkan tiga angka (Overloading)
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode ketiga: Menjumlahkan dua angka desimal (Overloading)
    double tambah(double a, double b) {
        return a + b;
    }
}

// Kelas utama (Main Class)
public class MethodOverloadingLat6 {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        // Memanggil metode dengan parameter yang berbeda
        System.out.println("Hasil tambah (2 angka): " + k.tambah(5, 10));        // Memanggil metode pertama
        System.out.println("Hasil tambah (3 angka): " + k.tambah(5, 10, 15));   // Memanggil metode kedua
        System.out.println("Hasil tambah (desimal): " + k.tambah(5.5, 2.5));    // Memanggil metode ketiga
    }
}
