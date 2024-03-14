import java.util.Scanner;

// Compiler version JDK 11.0.2

class Nasa {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        String angka = sc.nextLine();
        System.out.println("Selamat! Anda sudah mengakses NASA!");
        sc.close();
    }
}
