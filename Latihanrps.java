import java.util.Random;
import java.util.Scanner;

public class Latihanrps {
    public static void main(String[] x) {
        Scanner inputScanner = new Scanner(System.in);
        Random r = new Random();
        String[] Pilihan = { "Gunting", "Kertas", "Batu" };

        do {
            System.out.println("Pilih 0-2 ");
            System.out.println("0: Gunting");
            System.out.println("1: Kertas");
            System.out.println("2: Batu");

            int user = inputScanner.nextInt();

            // Memeriksa apakah input pengguna valid
            if (user < 0 || user > 2) {
                System.out.println("Input tidak valid. Harap masukkan 0, 1, atau 2.");
            } else {
                int computer = r.nextInt(3);

                System.out.println("User memilih: " + Pilihan[user]);
                System.out.println("Computer memilih: " + Pilihan[computer]);

                if (user == computer) {
                    System.out.println("Sayang sekali, pilihan anda seri");
                } else if ((user == 0 && computer == 1) || (user == 1 && computer == 2)
                        || (user == 2 && computer == 0)) {
                    System.out.println("User win");
                } else {
                    System.out.println("Computer win");
                }
            }

            System.out.println("Apakah Anda ingin bermain lagi? (Ya/Tidak): ");
            inputScanner.nextLine(); // Membuang newline dari input sebelumnya
        } while (inputScanner.nextLine().equalsIgnoreCase("Ya"));

        inputScanner.close();
    }
}
