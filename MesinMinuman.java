
import java.util.Scanner;

public class MesinMinuman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MESIN MINUMAN ===");
        System.out.println("1. Air Mineral");
        System.out.println("2. Teh");
        System.out.println("3. Kopi");
        System.out.println("4. Susu");
        System.out.println("5. Jus");

        System.out.print("Pilih minuman: ");
        String pilihan = input.next();

        switch (pilihan.toLowerCase()) {
            case "air mineral":
                System.out.println("Air Mineral = Rp5.000");
                break;
            case "teh":
                System.out.println("Teh = Rp4.000");
                break;
            case "kopi":
                System.out.println("Kopi = Rp7.000");
                break;
            case "susu":
                System.out.println("Susu = Rp6.000");
                break;
            case "jus":
                System.out.println("Jus = Rp8.000");
                break;    
            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}
