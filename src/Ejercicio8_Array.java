import java.util.ArrayList;
import java.util.Scanner;
//Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un programa que introduzca el nombre y la edad de cada alumno. El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (`*`) Al finalizar se mostrará los siguientes datos:

//- Todos lo alumnos mayores de edad.
//- Los alumnos mayores (los que tienen más edad)

public class Ejercicio8_Array {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce el nombre del alumno (o '*' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("*")) break;

            System.out.print("Introduce la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        int maxEdad = edades.stream().max(Integer::compare).orElse(0);
        System.out.println("\nAlumnos con mayor edad (" + maxEdad + " años):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == maxEdad) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        scanner.close();
    }
}