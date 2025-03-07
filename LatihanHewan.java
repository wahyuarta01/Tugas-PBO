class Hewan {
    // Atribut
    String nama;
    String jenis;
    int umur;

    // Konstruktor
    Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun");
    }

    // Metode untuk menambah umur
    void bertambahUmur(int tahun) {
        umur += tahun;
    }

    // Metode untuk menampilkan suara khas hewan
    void suaraHewan() {
        if (nama.equalsIgnoreCase("Singa")) {
            System.out.println(nama + ": Roar!");
        } else if (nama.equalsIgnoreCase("Buaya")) {
            System.out.println(nama + ": Grrrr!");
        } else {
            System.out.println(nama + ": (suara tidak diketahui)");
        }
    }
}

// Main Class untuk Latihan 1
public class LatihanHewan {
    public static void main(String[] args) {
        Hewan singa = new Hewan("Singa", "Mamalia", 5);
        singa.tampilkanInfo();
        singa.suaraHewan();
        System.out.println("Setelah bertambah umur:");
        singa.bertambahUmur(3);
        singa.tampilkanInfo();
        
        System.out.println(); // Spasi tambahan sebelum Buaya
        
        Hewan buaya = new Hewan("Buaya", "Reptil", 7);
        buaya.tampilkanInfo();
        buaya.suaraHewan();
        System.out.println("Setelah bertambah umur:");
        buaya.bertambahUmur(4);
        buaya.tampilkanInfo();
    }
}
