import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime de cuanto va a ser el lado del cuadrado");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println(area);
    }
}