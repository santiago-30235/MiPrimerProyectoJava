import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
    //Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabla de multiplicar del 5");

        for (int i = 1; i <=10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
            
        }

    }
}