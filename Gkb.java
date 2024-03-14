import java.util.Random;
import java.util.Scanner;

public class Gkb {
    public static void main(String[] args) {
        String[] pilihan = { "gunting", "kertas", "batu" };
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Selamat datang di permainan gunting kertas batu! ");
        System.out.println("Masukkan pilihan anda :");
        int user = sc.nextInt();
        int acak = r.nextInt(3);
        System.out.println("plihan anda : " + pilihan[user]);
        System.out.println("plihan anda : " + pilihan[acak]);

        if (user == acak) {
            System.out.println("Sayang sekali, hasilnya seri");
        } else if (user == 0 && acak == 1 || user == 1 && acak == 2 || user == 2 && acak == 0) {
            System.out.println("selamat! anda menang");
        } else {
            System.out.println("sayang sekali anda kalah");
        }
        sc.close();
    }
}