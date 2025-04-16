import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {
            System.out.print("\nMasukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = input.next().trim().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Hasil: " + (angka1 + angka2));
                    break;
                case '-':
                    System.out.println("Hasil: " + (angka1 - angka2));
                    break;
                case '*':
                    System.out.println("Hasil: " + (angka1 * angka2));
                    break;
                case '/':
                    if (angka2 != 0)
                        System.out.println("Hasil: " + (angka1 / angka2));
                    else
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    break;
                case '%':
                    System.out.println("Hasil: " + (angka1 % angka2));
                    break;
                default:
                    System.out.println("Operator tidak valid. Gunakan hanya + - * / %");
            }

            System.out.print("\nApakah Anda ingin menghitung lagi? (y/n): ");
            ulangi = input.next().charAt(0);

        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("\n Terima kasih telah menggunakan kalkulator!");
        input.close();
    }
}
