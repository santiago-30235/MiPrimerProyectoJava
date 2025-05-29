import java.util.Scanner;
//Crear un programa de ordenador para gestionar los resultados de la quiniela de fútbol. Para ello vamos a utilizar dos tablas:
//- Equipos: Que es una tabla de cadenas donde guardamos en cada columna el nombre de los equipos de cada partido. En la quiniela se indican 15 partidos.
//- Resultados: Es una tabla de enteros donde se indica el resultado. También tiene dos columnas, en la primera se guarda el número de goles del equipo que está guardado en la primera columna de la tabla anterior, y en la segunda los goles del otro equipo.

public class Ejercicio15_Array {
    public static void main(String[] args) {
        String[][] equipos = new String[15][2];
        int[][] resultados = new int[15][2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los nombres de los equipos para los 15 partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            System.out.print("Equipo 1: ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("Equipo 2: ");
            equipos[i][1] = scanner.nextLine();
        }

        System.out.println("\nIntroduce los resultados de los partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + " (" + equipos[i][0] + " vs " + equipos[i][1] + "):");
            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();
        }

        System.out.println("\nResultados de la quiniela:");
        for (int i = 0; i < 15; i++) {
            System.out.println(equipos[i][0] + " " + resultados[i][0] + " - " + resultados[i][1] + " " + equipos[i][1]);
        }

        scanner.close();
    }
}