
public class suhu {
    public static void main(String[] args) {

        int suhu = 20;

        System.out.println("Suhu: " + suhu + "°C");

        if (suhu > 27) {
            System.out.println("Terlalu Panas");
        } else if (suhu > 18) {
            System.out.println("Normal");
        }else {
            System.out.println("Terlalu Dingin");
        }
    }
}
