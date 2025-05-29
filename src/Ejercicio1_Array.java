import java.util.Random;
//Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros, a continuación lo inicialice con valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada elemento del vector junto con su cuadrado y su cubo.
public class Ejercicio1_Array {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = random.nextInt(10) + 1;
        }

        for (int num : vector_numeros) {
            System.out.println("Número: " + num + ", Cuadrado: " + (num * num) + ", Cubo: " + (num * num * num));
        }
    }
}