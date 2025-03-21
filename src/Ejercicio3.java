import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
    //Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
    //mostrar un mensaje indicando si el número tiene uno o dos dígitos.
    //(Tener en cuenta que condición debe cumplirse para tener dos dígitos
    //un número entero)
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese un numero positivo");
        int numero = scanner.nextInt();

        if (numero <10) {
            System.out.println("el numero tiene un digito");
            
            
        } else {
            if (numero <99) {
                System.out.println("el numero tiene dos digitos");
                
            } 
        
        }

        
            
        



    }
}