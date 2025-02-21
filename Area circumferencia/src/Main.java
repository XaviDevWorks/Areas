import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el radio de la circumferencia");
        double radio = scanner.nextDouble();

        double area = Math.PI * (Math.pow(radio, 2));
        System.out.println(area);
    }
}