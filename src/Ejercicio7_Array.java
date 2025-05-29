import java.util.Scanner;
//Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco enteros cada uno, pida valores para ‘vector1’ y ‘vector2’ y calcule vector3=vector1+vector2.

public class Ejercicio7_Array {
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los valores para vector1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Introduce los valores para vector2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = scanner.nextInt();
        }

        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("Resultado de vector3 (suma de vector1 y vector2):");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("vector3[" + i + "]: " + vector3[i]);
        }

        scanner.close();
    }
}