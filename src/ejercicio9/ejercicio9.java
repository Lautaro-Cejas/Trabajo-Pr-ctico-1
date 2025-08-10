package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author lauti
 */
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // CORREGIDO: nextLine() en lugar de nextInt()
        System.out.println("Hola, " + nombre);
    }
}
