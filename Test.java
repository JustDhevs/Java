import java.util.Random;
import java.util.Scanner;

public class Test {
    static void Dadu() {
        Random rd = new Random();
        int acak = rd.nextInt(6);
        System.out.println("Hasil dari dadu : ");
        System.out.println(acak + 1);
    }

    static void Quote() {
        String[] kutipan = {
                "Segala sesuatu memiliki kesudahan, yang sudah berakhir biarlah berlalu dan yakinlah semua akan baik-baik saja",
                "Setiap detik sangatlah berharga karena waktu mengetahui banyak hal, termasuk rahasia hati.",
                "Jika kamu tak menemukan buku yang kamu cari di rak, maka tulislah sendiri.",
                "Jika hatimu banyak merasakan sakit, maka belajarlah dari rasa sakit itu untuk tidak memberikan rasa sakit pada orang lain.",
                "Jika tidak ada bahu untuk bersandar masih ada danus untuk didahar."
        };

        // Objek Random untuk mengacak kutipan
        Random random = new Random();
        int acak = random.nextInt(kutipan.length);

        // Menampilkan kutipan secara acak
        System.out.println("Kata-kata hari ini: \n" + kutipan[acak]);
    }

    static void Gkb() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] pilihan = { "gunting", "kertas", "batu" };
        System.out.println("Selamat datang di permainan gunting kertas batu! ");
        System.out.println("Masukkan pilihan anda :");
        int user = sc.nextInt();
        int acak = r.nextInt(3);
        System.out.println("Pilihan anda : " + pilihan[user]);
        System.out.println("Pilihan komputer : " + pilihan[acak]);

        if (user == acak) {
            System.out.println("Sayang sekali, hasilnya seri");
        } else if ((user == 0 && acak == 1) || (user == 1 && acak == 2) || (user == 2 && acak == 0)) {
            System.out.println("Selamat! Anda menang");
        } else {
            System.out.println("Sayang sekali, anda kalah");
        }
        // Do not close Scanner here to keep System.in open for the entire program.
    }

    static void Calculator() {
        Scanner sc = new Scanner(System.in);
        int angka1, angka2, hasil, aritmatika;
        while (true) {

            // masukkan jenis operator
            System.out.println("Selamat datang di Kalkulator Sederhana ");
            System.out.println("pilih opsi");
            System.out.println("1. Penjumlahan. ");
            System.out.println("2. Pengurangan. ");
            System.out.println("3. Perkalian.");
            System.out.println("4. Pembagian.");
            System.out.println("5. Keluar");

            aritmatika = sc.nextInt();
            // percabangan jika memilih angka 5
            if (aritmatika == 5) {
                System.out.println("Program akan berhenti, sampai jumpa lagi.");
                break;

            }

            // masukkan angka pertama
            System.out.println("Masukkan angka pertama : ");
            angka1 = sc.nextInt();
            // Masukkan angka kedua
            System.out.println("Masukkan angka kedua : ");
            angka2 = sc.nextInt();
            // switch untuk kemungkinan operator
            switch (aritmatika) {
                case 1:
                    hasil = angka1 + angka2;
                    System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                    break;
                case 4:
                    if (angka2 != 0) {
                        System.out.println("Hasil: " + (angka1 / angka2));
                    } else {
                        System.out.println("Error: Tidak bisa dibagi dengan bilangan nol. ");
                    }
                    break;

                default:
                    System.out.println("opsi tidak valid!");
                    break;
            }
        }
        sc.close();
    }

    static void Kuis() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Selamat datang di kuis matematika!");
        boolean running = true;
        int correctCount = 0;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat Datang di JustDhevs's Project ");
        System.out.println("Masukkan input : ");
        System.out.println("1. Dadu ");
        System.out.println("2. Gunting Kertas Batu ");
        System.out.println("3. Random Quote Generator ");
        System.out.println("4. Calculator ");
        System.out.println("5. Kuis Matematika");
        System.out.println("6. Keluar");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                Dadu();
                break;
            case 2:
                Gkb();
                break;
            case 3:
                Quote();
                break;
            case 4:
                Calculator();
                break;
            case 5:
                Kuis();
                break;
            case 6:
                System.out.println("Program akan berhenti, sampai jumpa! ");
                break;
            default:
                System.out.println("Input yang anda masukkan salah");
                break;
        }
    }
}