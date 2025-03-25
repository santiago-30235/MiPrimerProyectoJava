import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
    /*
    En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
    realizar un programa que lea los sueldos que cobra cada empleado e informe
    cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
    Además el programa deberá informar el importe que gasta la empresa en sueldos
    al personal.
    */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados ");
        int empleados = scanner.nextInt();

        int empleadosMenos = 0;
        int empleadosMas = 0;
        double totalsueldos = 0;

        for (int i = 1; i <= empleados; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo >= 100 && sueldo <= 300) {
                empleadosMenos++;
            } else if (sueldo > 300) {
                empleadosMas++;
            }

            totalsueldos += sueldo;
        }

        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + empleadosMenos);
        System.out.println("Cantidad de empleados que cobran más de $300: " + empleadosMas);
        System.out.println("Gasto total en sueldos: $" + totalsueldos);

        scanner.close();
    }
}