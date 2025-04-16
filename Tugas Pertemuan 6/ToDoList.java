import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tugas = new ArrayList<>();
        int pilihan;

        System.out.println(" Selamat datang di Aplikasi To-Do List!");

        do {
            // Tampilkan menu
            System.out.println("\n=== MENU TO-DO LIST ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Buang newline sisa input angka

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama tugas: ");
                    String tugasBaru = input.nextLine();
                    tugas.add(tugasBaru);
                    System.out.println(" Tugas berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR TUGAS ===");
                    if (tugas.isEmpty()) {
                        System.out.println(" Belum ada tugas.");
                    } else {
                        for (int i = 0; i < tugas.size(); i++) {
                            System.out.println((i + 1) + ". " + tugas.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tugas.isEmpty()) {
                        System.out.println("️ Tidak ada tugas untuk dihapus.");
                    } else {
                        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                        int index = input.nextInt();
                        input.nextLine(); // Buang newline
                        if (index >= 1 && index <= tugas.size()) {
                            tugas.remove(index - 1);
                            System.out.println("️ Tugas berhasil dihapus.");
                        } else {
                            System.out.println(" Nomor tugas tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println(" Terima kasih telah menggunakan To-Do List!");
                    break;

                default:
                    System.out.println(" Pilihan tidak valid. Silakan pilih antara 1 - 4.");
            }
        } while (pilihan != 4);

        input.close();
    }
}
