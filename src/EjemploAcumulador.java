import java.util.Scanner;

public class EjemploAcumulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int suma = 0;  // Inicializamos el acumulador

    for (int i = 1; i <= 5; i++) {
        suma += i;  // Acumulamos el valor de i en cada iteración
    }

    System.out.println("La suma total es: " + suma);   
        }
 }
