import java.util.Random;
import java.util.Scanner;

public class Kuis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Selamat datang di kuis matematika!");
        boolean running = true;
        int correctCount = 0; // Counter for correct answers

        while (running) {
            System.out.println("Pilih operator : ");
            System.out.println("1. Penjumlahan. ");
            System.out.println("2. Pengurangan. ");
            System.out.println("3. Perkalian.");
            System.out.println("4. Pembagian.");
            System.out.println("5. Keluar");
            int apcb = sc.nextInt();

            if (apcb == 5) {
                System.out.println("Program akan berhenti, selamat tinggal!");
                running = false;
            } else if (apcb < 1 || apcb > 4) {
                System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
            } else {
                int angka1 = rd.nextInt(50) + 1;
                int angka2 = rd.nextInt(50) + 1;
                int hasil = 0;

                switch (apcb) {
                    case 1:
                        hasil = angka1 + angka2;
                        System.out.println(angka1 + "+" + angka2 + "= ? ");
                        break;
                    case 2:
                        hasil = angka1 - angka2;
                        System.out.println(angka1 + "-" + angka2 + "= ? ");
                        break;
                    case 3:
                        hasil = angka1 * angka2;
                        System.out.println(angka1 + "X" + angka2 + "= ? ");
                        break;
                    case 4:
                        hasil = angka1 / angka2;
                        System.out.println(angka1 + "/" + angka2 + "= ? ");
                        break;
                    default:
                        break;
                }

                int tebakan = sc.nextInt();
                if (tebakan == hasil) {
                    System.out.println("Selamat anda benar");
                    correctCount++; // Increment correct answer count
                } else {
                    System.out.println("Sayang sekali anda kalah!");
                    System.out.println("Jawaban yang benar adalah: " + hasil);
                }
            }
        }

        System.out.println("Jumlah jawaban benar: " + correctCount);
        sc.close();
    }
}
