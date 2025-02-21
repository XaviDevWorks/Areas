import java.util.Scanner;
import java.lang.Math;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double area;
    public static void main(String[] args) {

        System.out.println("Menu:\n1)Area Cuadrado\n2)Area Triangulo\n3)Area Circumferencia");
        int option = scanner.nextInt();
        menu(option);
        System.out.println(area);
    }

    public static void menu(int option){
        switch (option){
            case 1:
                cuadrado();
                break;
            case 2:
                triangulo();
                break;
            case 3:
                circumferencia();
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void cuadrado(){
        System.out.println("Dime de cuanto va a ser el lado del cuadrado");
        double lado = scanner.nextDouble();

        area = Math.pow(lado, 2);
    }

    public static void triangulo(){
        System.out.println("Dame la base");
        double base = scanner.nextDouble();
        System.out.println("Dame la altura");
        double altura = scanner.nextDouble();

        area = ((altura * base) / 2);
    }

    public static void circumferencia(){
        System.out.println("Dame el radio de la circumferencia");
        double radio = scanner.nextDouble();

        area = Math.PI * (Math.pow(radio, 2));
    }
}