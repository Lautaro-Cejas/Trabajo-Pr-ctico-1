package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author lauti
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad + " años");

    }
}
