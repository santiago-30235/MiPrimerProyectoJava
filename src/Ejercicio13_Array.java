import java.util.Scanner;
//De una empresa de transporte se quiere guardar el nombre de los conductores que tiene, y los kilómetros que conducen cada día de la semana.
//Para guardar esta información se van a utilizar dos arreglos:
//- Nombre: Vector para guardar los nombres de los conductores.
//- kms: Tabla para guardar los kilómetros que realizan cada día de la semana.
//Se quiere generar un nuevo vector (“total_kms”) con los kilómetros totales que realza cada conductor.
//Al finalizar se muestra la lista con los nombres de conductores y los kilómetros que ha realizado.

public class Ejercicio13_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[3];  
        int[][] kms = new int[3][7]; 
        int[] total_kms = new int[3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.println("Introduce los kilómetros realizados por " + nombres[i] + " cada día:");
            for (int j = 0; j < 7; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); 
        }

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < 7; j++) {
                total_kms[i] += kms[i][j];
            }
        }

        System.out.println("\nKilómetros realizados por cada conductor:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " km");
        }

        scanner.close();
    }
}