// Membuat interface Hewan
interface Hewan {
    void makan();
}

// Membuat interface Mamalia
interface Mamalia {
    void menyusui();
}

// Kucing mengimplementasikan 2 interface (Multiple Inheritance)
class Kucing implements Hewan, Mamalia {
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }

    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }
}

// Kelas utama (Main Program)
public class MultipleInheritanceDenganInterfaceLat4 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing();

        // Memanggil method dari interface Hewan & Mamalia
        kucing1.makan();
        kucing1.menyusui();
    }
}
