import java.util.Random;
import java.util.Scanner;

public class Jancox {
    public static void main(String[] x) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        String[] Pilihan = { "Gunting", "Kertas", "Batu" };
        System.out.println("pilih 0-2");
        int User = input.nextInt();
        int Com = r.nextInt(3);
        System.out.println("Player's Choice : " + Pilihan[User]);
        System.out.println("computer's choice : " + Pilihan[Com]);
        if (User == Com) {
            System.out.println("Seri");
        }
        if (User == 0) {
            if (Com == 1) {
                System.out.println("Player Menang");
            }
        }
        if (User == 0) {
            if (Com == 2) {
                System.out.println("Computer menang");
            }
        }
        if (User == 1) {
            if (Com == 2) {
                System.out.println("Player menang");
            }
        }
        if (User == 1) {
            if (Com == 0) {
                System.out.println("Computer menang");
            }
        }
        if (User == 2) {
            if (Com == 0) {
                System.out.println("Player menang");
            }
        }
        if (User == 2) {
            if (Com == 1) {
                System.out.println("Computer menang");
            }
        }
        input.close();
    }
}