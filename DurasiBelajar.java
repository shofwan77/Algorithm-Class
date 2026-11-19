
public class DurasiBelajar {
    public static void main(String[] args) {

        int[] durasi = { 45, 60, 30, 90, 75 };

        int total = 0;
        int terlama = durasi[0];
        int tersingkat = durasi[0];

        System.out.println("=== DATA DURASI BELAJAR ===");

        
        for (int i = 0; i < durasi.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + durasi[i] + " menit");

            total += durasi[i];

            if (durasi[i] > terlama) {
                terlama = durasi[i];
            }

            if (durasi[i] < tersingkat) {
                tersingkat = durasi[i];
            }
        }

        
        double rataRata = (double) total / durasi.length;

        System.out.println("\nTotal durasi: " + total + " menit");
        System.out.println("Rata-rata: " + rataRata + " menit");
        System.out.println("Durasi terlama: " + terlama + " menit");
        System.out.println("Durasi tersingkat: " + tersingkat + " menit");
    }

}
