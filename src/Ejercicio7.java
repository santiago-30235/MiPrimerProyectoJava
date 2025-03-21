import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    //Confeccionar un programa que permita cargar un número entero positivo
    //de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
    //Mostrar un mensaje de error si el número de cifras es mayor.
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero positivo");
        int numero = scanner.nextInt();

        if (numero <10) {
            System.out.println("el numero tiene una cifra");
            
            
        } else {
            if (numero <100) {
                System.out.println("el numero tiene dos cifras");
                
            } else {
                if (numero<1000) {
                 System.out.println("el numero tiene tres cifras");
                    
                } else {
                 System.out.println("error");
                }

                    
            }
        
        }

        
            
        



    }
}

