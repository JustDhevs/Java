import java.util.Scanner;

    public class Segitiga {
        public static void main(String[] x) {
            int angka1, angka2, angka3, angka4, angka5, hasil1, hasil2;
            java.util.Scanner inputUser = new Scanner (System.in);
            System.out.print("Masukkan Alas Segitiga : ");
            angka1=inputUser.nextInt();
            System.out.print("Masukkan Tinggi Segitiga : ");
            angka2=inputUser.nextInt();
            System.out.print("Masukkan Sisi 1 : ");
            angka4=inputUser.nextInt();
            System.out.print("Masukkan Sisi 2 : ");
            angka5=inputUser.nextInt();
            angka3=2;
            hasil1 = angka1 * angka2 / angka3;
            hasil2 = angka1 + angka4 + angka5;
            System.out.println("luas : " + angka1 * angka2 / angka3);
            System.out.print("Keliling : " +( angka1 + angka4 + angka5));
            inputUser.close();
        }
    }