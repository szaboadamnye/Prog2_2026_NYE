import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kérd be az aktuális hőmérsékletet (°C): ");
        int homerseklet = Integer.parseInt(input.nextLine());

        if (homerseklet < 0) {
            System.out.println("Fagyos");
        } else if (homerseklet < 30) {
            System.out.println("Átlagos");
        } else {
            System.out.println("Túl meleg");
        }
    }
}