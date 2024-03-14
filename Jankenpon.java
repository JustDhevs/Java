import java.util.Scanner;
import java.util.random;

public class Jankenpon {
        public static void main(String[] x) {
            
            Scanner inputUser = new Scanner (System.in);
            Random r = new Random();
            String [] tangan = {"Gunting","Batu","Kertas"};
            System.out.println("0. Gunting");
            System.out.println("1. Batu");
            System.out.println("2. Kertas");
            System.out.print("Pilih 0-2 : ");
            int index=inputUser.nextInt();
            int Acak= r.nextInt(3);
            System.out.println("Player's Choice : " +tangan[index]);
            System.out.print("computer's choice : " +tangan[Acak]);
            inputUser.close();

    }
}