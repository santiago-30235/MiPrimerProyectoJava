import java.util.Scanner;

public class Ejercico15 {
    public static void main(String[] args) {
    //Utiliza el método: compareToIgnoreCase()
    //Realizar la carga de dos nombres de personas distintos.
    //Mostrar por pantalla luego ordenados en forma alfabética.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el segundo nombre");
        String nombre2 = scanner.nextLine();

        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println("\nNombres ordenados alfabéticamente:");
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else {
            System.out.println("\nNombres ordenados alfabéticamente:");
            System.out.println(nombre2);
            System.out.println(nombre1);
        }
    }
}
