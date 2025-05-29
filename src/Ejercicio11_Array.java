
public class Ejercicio11_Array {
    //Diseñar el algoritmo correspondiente a un programa, que:
    //- Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’.
    //- Carga la tabla de forma que los componentes pertenecientes a la diagonal de la matriz tomen el valor 1 y el resto el valor 0.
    //- Muestra el contenido de la tabla en pantalla.
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1; 
                } else {
                    diagonal[i][j] = 0; 
                }
            }
        }

        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}