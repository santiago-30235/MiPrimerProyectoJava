import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    //Realizar un programa que solicite la carga por teclado de dos números,
    //si el primero es mayor al segundo informar su suma y diferencia,
    //en caso contrario informar el producto y la división
    //del primero respecto al segundo.
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("ingrese el segundo numero");
        double num2 = scanner.nextDouble();

        if ( num1>num2){
            double suma = num1 + num2;
            double resta= num1 - num2;

            System.out.println("como el orimero numero  es mayor que el segundo numeeo se suma o se resta");
            System.out.println("la suma es:"+suma);
            System.out.println("la resta es:"+resta); 
            
            
        } else {

           double multiplicacion= num1 *num2;
           double division= num1 / num2;

           System.out.println("como el primer numero es menor que el segundo numero se multiplica o divide ");
           System.out.println("la multiplicacion es:"+multiplicacion);
           System.out.println("la division es:"+division); {

            
        }

    }
}}
