import java.util.Scanner;
//Diseñar el algoritmo correspondiente a un programa, que:

//- Crea una tabla bidimensional de longitud 5x5 y nombre ‘matriz’.
//- Carga la tabla con valores numéricos enteros.
//- Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla.

public class Ejercicio10_Array {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los valores para la matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        scanner.close();
    }
}