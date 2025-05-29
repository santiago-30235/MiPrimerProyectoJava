
import java.util.Scanner;
//Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que se llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los elementos introducidos).
public class Ejercicio4_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        int count = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce un número (negativo para terminar): ");
            int num = scanner.nextInt();
            if (num < 0) break;
            vector[i] = num;
            count++;
        }

        System.out.println("Elementos del vector:");
        for (int i = 0; i < count; i++) {
            System.out.println(vector[i]);
        }

        scanner.close();
    }
}