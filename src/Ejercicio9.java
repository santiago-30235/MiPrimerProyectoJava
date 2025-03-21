import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
    /*
    Confeccionar un programa que pida por teclado tres notas de un alumno,
    calcule el promedio e imprima alguno de estos mensajes:
    Si el promedio es >=7 mostrar "Promocionado".
    Si el promedio es >=4 y <7 mostrar "Regular".
    Si el promedio es <4 mostrar "Reprobado".
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres notas de un alumno");

        System.out.println("ingrese la primera nota");
        float nota1 = scanner.nextFloat();
        System.out.println("ingrese la segunda nota");
        float nota2 = scanner.nextFloat();
        System.out.println("ingrese la tercera nota");
        float nota3 = scanner.nextFloat();

        double promedio= (nota1 + nota2 + nota3) /3;
        if (promedio>=7) {
            System.out.println("promocionado");
            
        } else {
            if ((promedio>=4) & (promedio<7)) {
                System.out.println("regular");
                
            } else {
                if (promedio<4) {
                    System.out.println("reprobado");
                    
                }
                
            }
        }


    
    }
}
