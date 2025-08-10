package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author lauti
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingresa el segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

    }
}
