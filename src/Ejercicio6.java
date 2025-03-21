import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    //Se ingresa por teclado un valor entero,
    //mostrar una leyenda que indique si el número es positivo,
    //negativo o nulo (es decir cero)
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = scanner.nextInt();

        if (numero>0) {
            System.out.println("el numero es positivo");
            
        } else {
            if (numero<0) {
                System.out.println("el numero es negativo");
                
            } else {
                System.out.println("el numero es nulo");
                
            }
            
        }
}   }
