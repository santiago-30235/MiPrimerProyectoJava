import java.util.Scanner;
//Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.

public class Ejercicio3_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0, max = 0, min = 10;

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Introduce la nota " + (i + 1) + " (entre 0 y 10): ");
                notas[i] = scanner.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);
            suma += notas[i];
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
        }

        System.out.println("Notas introducidas:");
        for (double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Nota media: " + (suma / notas.length));
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

        scanner.close();
    }
}