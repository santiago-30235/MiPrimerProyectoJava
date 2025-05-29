import java.util.Arrays;
import java.util.Random;
//Hacer un programa que inicialice un vector de números con valores aleatorios, y posterior ordene los elementos de menor a mayor.

public class Ejercicio5_Array {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); 
        }

        Arrays.sort(vector);

        System.out.println("Vector ordenado:");
        for (int num : vector) {
            System.out.println(num);
        }
    }
}