import java.util.Scanner;
public class MayorDeTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numnero");
        int num1 = scanner.nextInt();

        System.out.println("ingrese el segundo numnero");
        int num2 = scanner.nextInt();

        System.out.println("ingrese el tercer numnero");
        int num3 = scanner.nextInt();

        if (num1>num2 && num1>num3) { System.out.println("el numero mayor es: " + num1);
            
        } else {

            if (num2>num1 && num2>num3) { System.out.println("el numero mayor es:" + num2);
            
             } else {    
            System.out.println("el numero mayor es num3" + num3);
        }

    }
} }  