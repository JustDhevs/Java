import java.util.Random;

public class Dadu {
    public static void main(String[] args) {

        Random rd = new Random();
        int acak = rd.nextInt(6)+1;
        System.out.println("Hasil dari dadu : ");
        System.out.println(acak);

    }

}