import java.util.Scanner;

public class biayaPerjalanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int jarakTempuh;
        int tarifPerKm;
        int totalBiaya;
        int tarifParkir;


        System.out.print("Masukkan jarak tempuh (dalam km): ");
        jarakTempuh = input.nextInt();

        System.out.print("Masukkan tarif per km: Rp");
        tarifPerKm = input.nextInt();

        System.out.print("Masukkan tarif parkir: Rp");
        tarifParkir = input.nextInt();

        totalBiaya = (jarakTempuh * tarifPerKm) + tarifParkir;

        System.out.println("\n=== DETAIL BIAYA PERJALANAN ===");
        System.out.println("Total biaya perjalanan: Rp" + totalBiaya);
        System.out.println("Tarif Parkir: Rp" + tarifParkir);
        System.out.println("===============================");

        input.close();
    }
}