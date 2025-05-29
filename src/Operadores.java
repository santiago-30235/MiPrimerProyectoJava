import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);

        System.out.println("ingrese el primer numero:");
        int num1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        System.out.println("ingrese el tercer numero:");
        int num3 = scanner.nextInt();

        boolean resultado = (num1 > num2) && (num1 < num3);

        System.out.println("el resultado es:" + resultado);
    
    }
}  