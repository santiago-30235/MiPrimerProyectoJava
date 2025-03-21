import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
    //mostrar un mensaje "Promocionado".
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese tres notas de un alumno");

        System.out.println("ingrese la primera nota");
        float nota1 = scanner.nextFloat();
        System.out.println("ingrese la segunda nota");
        float nota2 = scanner.nextFloat();
        System.out.println("ingrese la tercera nota");
        float nota3 = scanner.nextFloat();


        double promedio= (nota1 + nota2 + nota3) /3;
       
        if (promedio >= 7) {
            System.out.println("Promocionado");
            
        } else {
            System.out.println("No promocionado");
            
        }




    }
}
