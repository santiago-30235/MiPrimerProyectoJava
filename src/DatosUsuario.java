import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su altura en metros, al ingrasar tu altura no uses un punto usa una coma: ");
        float altura = scanner.nextFloat();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años y tu altura es " + altura + " metros.");
    }
}