import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tinggi_segitiga, i, j;
        System.out.print("Input Tinggi Segitiga : ");
        tinggi_segitiga = input.nextInt();

        System.out.println();
        for (i = 1; i <= tinggi_segitiga; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}