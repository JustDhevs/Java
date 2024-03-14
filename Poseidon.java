import java.util.Scanner;
import java.util.Random;

public class Poseidon {
    public static void main(String[] x) {
        System.out.println("Selamat Datang di permainan tebak angka");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int angka = random.nextInt(100);
        int i = 0;
        boolean berhasil = true;
        while (berhasil) {
            System.out.println("silahkan masukkan angka : ");
            int tebakan = sc.nextInt();
            i++;
            if (tebakan == angka) {
                System.out.println("Selamat anda berhasil menebak " + angka + " setelah " + i + " jumlah tebakan ");
            } else if (tebakan < angka) {
                System.out.println("Lebih dari : " + tebakan);
            } else {
                System.out.println("kurang dari : " + tebakan);
            }
        }
        sc.close();
    }
}