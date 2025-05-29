import java.util.Scanner;

public class PromedioArray {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que ingrese 5 números y los almacene en un array. Luego, el programa debe calcular e imprimir el **promedio** de esos números.

        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar 5 números
        int[] numeros = new int[5];
        int suma = 0;

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; // Acumular la suma
        }

        // Calcular el promedio
        double promedio = suma / (double) numeros.length;

        // Imprimir el resultado
        System.out.println("El promedio es: " + promedio);
    }
}