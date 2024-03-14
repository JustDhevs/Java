import java.util.Scanner;
import java.util.Random;
public class Rps {
    public static void main(String[] args) {
        String[] pilihan = { "Gunting", "batu", "Kertas" };
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Selamat datang di game gunting kertas batu! ");
        System.out.println("Masukkan pilihan anda : ");
        System.out.println("Pilih 0-2 ");
        System.out.println("0: Gunting");
        System.out.println("1: batu");
        System.out.println("2: kertas");
        //
        int hasil1 = sc.nextInt();
        int hasil2 = rd.nextInt(3);
        System.out.println("User memilih: " + pilihan[hasil1]);
        System.out.println("Computer memilih: " + pilihan[hasil2]);
        if (hasil1 == hasil2) {
             System.out.println("Sayang Sekali, Hasilnya adalah seri");
        } else if (hasil1 == 0 && hasil2 == 2 || hasil1 == 1 && hasil2 == 0 || hasil1 == 2 && hasil2 == 1 ) {
            System.out.println("Selamat anda menang!");
        } else {
            System.out.println("Sayang sekali, anda kalah");
        }
        sc.close();
    }
}