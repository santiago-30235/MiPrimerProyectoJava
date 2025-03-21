import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
    /*
    Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
    cuántos tienen notas mayores o iguales a 7 y cuántos menores.
    */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota del alumno 1: ");
        int nota1 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 2: ");
        int nota2 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 3: ");
        int nota3 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 4: ");
        int nota4 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 5: ");
        int nota5 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 6: ");
        int nota6 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 7: ");
        int nota7 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 8: ");
        int nota8 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 9: ");
        int nota9 = scanner.nextInt();

        System.out.print("Ingrese la nota del alumno 10: ");
        int nota10 = scanner.nextInt();

       
        int mayoresIguales7 = 0;
        int menores7 = 0;
        if ((nota1 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota2 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota3 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota4 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota5 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota6 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota7 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota8 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota9 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }
        if ((nota10 >= 7) ) { mayoresIguales7++;
            
        } else {
            menores7++;
            
        }

        System.out.println("Cantidad de notas mayores o iguales a 7: " + mayoresIguales7);
        System.out.println("Cantidad de notas menores a 7: " + menores7);

    }
}