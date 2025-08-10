package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author lauti
 */
public class ejercicio8 {

//    a. División con enteros:
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingresa el primer número: ");
//        int num1 = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Ingresa el segundo número: ");
//        int num2 = Integer.parseInt(scanner.nextLine());
//
//        int resultado = num1 / num2;
//        System.out.println("División (enteros): " + resultado);
//
//    }
//  b. División con double:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingresa el segundo número: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        double resultado = num1 / num2;
        System.out.println("División (double): " + resultado);

    }
}
