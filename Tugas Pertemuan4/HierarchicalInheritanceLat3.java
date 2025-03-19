// Superclass (Induk)
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Subclass 1: Kucing
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Subclass 2: Anjing
class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Main class untuk menjalankan program
public class HierarchicalInheritanceLat3 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing();
        System.out.println("Kucing:");
        kucing1.makan();  // Dari superclass
        kucing1.suara();  // Dari subclass
        System.out.println();

        // Membuat objek Anjing
        Anjing anjing1 = new Anjing();
        System.out.println("Anjing:");
        anjing1.makan();  // Dari superclass
        anjing1.suara();  // Dari subclass
    }
}
