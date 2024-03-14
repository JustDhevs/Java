import java.util.Scanner;

public class Gatau {
    public static void main(String[] x) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int a = inputUser.nextInt();
        if (a < 100) {
            System.out.print("angka itu lebih kecil dari 100 ");
        } else {
            System.out.print("angka itu lebih besar dari 100 ");
        }
        inputUser.close();
    }
}