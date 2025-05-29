public class Ejercicio12_Array {
    //Diseñar el algoritmo correspondiente a un programa, que:
    //- Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
    //- Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras que el resto de los elementos contendrán el valor 0.
    public static void main(String[] args) {
        int[][] marco = new int[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1; 
                } else {
                    marco[i][j] = 0; 
                }
            }
        }

        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
}