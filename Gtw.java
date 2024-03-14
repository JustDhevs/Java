import java.util.Scanner;

public class Gtw {
    public static void main(String[] x) {
        char operator;
        int angka1, angka2, hasil;
        // scanner
        Scanner sc = new Scanner(System.in);
        // input operator
        System.out.println("Masukkan Operator +, -, /, * ");
        operator = sc.next().charAt(0);
        // input angka1
        System.out.println("Masukkan angka pertama : ");
        angka1 = sc.nextInt();
        // input angka2
        System.out.println("Masukkan angka kedua : ");
        angka2 = sc.nextInt();
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + "*" + angka2 + "=" + hasil);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        sc.close();
    }
}