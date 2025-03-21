import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese sueldo");
        float sueldo = scanner.nextFloat();
        System.out.println("ingrese años de antiguedad");
        float años = scanner.nextFloat();

        if ((sueldo<500) & (años>=10)) {
            float aumentoPagar = (0.2f*sueldo)+sueldo;
            System.out.println("sueldo a pagar es "+ aumentoPagar);
            
        } else {
            if ((sueldo<500) & (años<10)) {
              float aumentoPagar = (0.5f*sueldo)+sueldo;
              System.out.println("sueldo a pagar es "+ aumentoPagar);
            }
             else {
               if ((sueldo>=500)) {
                  System.out.println("sueldo a pagar es "+ sueldo);}}}
    }
}

        

    


