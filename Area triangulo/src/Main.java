import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame la base");
        double base = scanner.nextDouble();
        System.out.println("Dame la altura");
        double altura = scanner.nextDouble();

        double area = ((altura * base) / 2);
        System.out.println(area);
    }
}