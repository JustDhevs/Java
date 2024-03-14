import java.util.Random;

public class Quote {
    public static void main(String[] args) {
        // Array berisi kutipan-kutipan
        String[] kutipan = {
                "Segala sesuatu memiliki kesudahan, yang sudah berakhir biarlah berlalu dan yakinlah semua akan baik-baik saja",
                "Setiap detik sangatlah berharga karena waktu mengetahui banyak hal, termasuk rahasia hati.",
                "Jika kamu tak menemukan buku yang kamu cari di rak, maka tulislah sendiri.",
                "Jika hatimu banyak merasakan sakit, maka belajarlah dari rasa sakit itu untuk tidak memberikan rasa sakit pada orang lain.",
                "Jika tidak ada bahu untuk bersandar masih ada danus untuk didahar."
        };

        // Objek Random untuk mengacak kutipan
        Random random = new Random();
        int acak = random.nextInt(kutipan.length);

        // Menampilkan kutipan secara acak
        System.out.println("Kata-kata hari ini:\n" + kutipan[acak]);
    }
}
