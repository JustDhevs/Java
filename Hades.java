import java.util.Scanner;

public class Hades {
    public static void main(String[] x) {
        Scanner apacoba = new Scanner(System.in);
        System.out.println("Masukkan hari : ");
        int day = apacoba.nextInt();
        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
        }
        apacoba.close();
    }
}