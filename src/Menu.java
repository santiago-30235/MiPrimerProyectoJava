import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.division");

        int opcion= scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("suma: " + num1+num2);
                break;
            case 2:
                System.out.println("resta:" + (num1-num2));
                break;
            case 3:
                System.out.println("multiplicacion: " + num1*num2);
                break;
            case 4:
                System.out.println("division: " + num1/num2);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
            }
        }
        

        
    }

