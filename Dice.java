import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        // masukkan array yang berisi value dari sebuah dadu
        int[] dadu = { 1, 2, 3, 4, 5, 6 };
        // masukkan random
        Random random = new Random();
        // masukkan hasil untuk mengacak isi dari dadu
        int result1 = dadu[random.nextInt(6)];
        int result2 = dadu[random.nextInt(6)];
        // print hasil
        System.out.println("Output dari dadu User : " + result1);
        System.out.println("Output dari dadu Computer : " + result2);
        System.out.println("==================================");
        // menentukan hasil pertandingan
        if (result1 == result2) {
            System.out.println("seri bang");
        } else if (result1 > result2) {
            System.out.println("User menang");
        } else {
            System.out.println("Computer menang");
        }
    }
}
