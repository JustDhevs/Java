import java.util.Scanner;

public class Calculator {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        int angka1, angka2, hasil, aritmatika;
        while (true) {

            // masukkan jenis operator
            System.out.println("Kalkulator Sederhana ");
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
}