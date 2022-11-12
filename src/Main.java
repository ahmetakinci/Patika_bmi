import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double boy;
        int kilo;

        System.out.print("Boyunuzu girin(Örn-1,72): ");
        boy = scanner.nextDouble();

        System.out.print("Kilonuzu girin(Örn-105): ");
        kilo = scanner.nextInt();

        double bmi = kilo/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz: " + bmi);
    }
}
