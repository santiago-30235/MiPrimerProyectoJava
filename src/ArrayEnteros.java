//Crea un método que reciba un array de enteros y modifique sus valores. Este ejercicio te permitirá observar cómo los arrays se pasan por referencia en Java.
public class ArrayEnteros {

    // Método que modifica los valores del arreglo
    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;  // Duplicamos cada valor del array
        }

        System.out.print("Dentro del método: ");
        mostrarArray(arr);
    }

    // Método para mostrar los valores del arreglo
    public static void mostrarArray(int[] arr) {
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    // Método principal
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("Antes de modificar: ");
        mostrarArray(numeros);

        modificarArray(numeros);

        System.out.print("Después de modificar: ");
        mostrarArray(numeros);
    }
}
