import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    //Realizar un programa que solicite ingresar
    //dos números distintos y muestre por pantalla el mayor de ellos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.println("el numero mayor es "+num1);
            
        } else {
            System.out.println("el numero mayor es "+num2);
            
        }
    }
}
