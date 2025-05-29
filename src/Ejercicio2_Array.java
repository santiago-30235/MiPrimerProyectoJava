
import java.util.Scanner;
//Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la pantalla.

public class Ejercicio2_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] original = new String[5];
        String[] inverso = new String[5];

        for (int i = 0; i < original.length; i++) {
            System.out.print("Introduce una cadena: ");
            original[i] = scanner.nextLine();
        }

        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i];
        }

        System.out.println("Vector en orden inverso:");
        for (String s : inverso) {
            System.out.println(s);
        }

        scanner.close();
    }
}