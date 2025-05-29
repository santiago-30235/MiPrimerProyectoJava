import java.util.Scanner;
//Crear un programa que lea los precios de 5 artículos y las cantidades vendidas por una empresa en sus 4 sucursales. Informar:

//- Las cantidades totales de cada articulo.
//- La cantidad de artículos en la sucursal 2.
//- La cantidad del articulo 3 en la sucursal 1.
//- La recaudación total de cada sucursal.
//- La recaudación total de la empresa.
//- La sucursal de mayor recaudación.

public class Ejercicio14_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precios = new double[5];
        int[][] cantidades = new int[5][4]; 
        double[] recaudacionSucursal = new double[4];
        double recaudacionTotalEmpresa = 0;

        System.out.println("Introduce los precios de los 5 artículos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        System.out.println("\nIntroduce las cantidades vendidas por cada sucursal:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Artículo " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Sucursal " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nCantidades totales de cada artículo:");
        for (int i = 0; i < 5; i++) {
            int totalArticulo = 0;
            for (int j = 0; j < 4; j++) {
                totalArticulo += cantidades[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": " + totalArticulo);
        }

        System.out.println("\nCantidad de artículos en la sucursal 2:");
        int totalSucursal2 = 0;
        for (int i = 0; i < 5; i++) {
            totalSucursal2 += cantidades[i][1];
        }
        System.out.println("Total en sucursal 2: " + totalSucursal2);

        System.out.println("\nCantidad del artículo 3 en la sucursal 1:");
        System.out.println("Artículo 3 en sucursal 1: " + cantidades[2][0]);

        System.out.println("\nRecaudación total de cada sucursal:");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                recaudacionSucursal[j] += cantidades[i][j] * precios[i];
            }
            recaudacionTotalEmpresa += recaudacionSucursal[j];
            System.out.println("Sucursal " + (j + 1) + ": $" + recaudacionSucursal[j]);
        }

        System.out.println("\nRecaudación total de la empresa: $" + recaudacionTotalEmpresa);

        double mayorRecaudacion = recaudacionSucursal[0];
        int sucursalMayor = 1;
        for (int j = 1; j < 4; j++) {
            if (recaudacionSucursal[j] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal[j];
                sucursalMayor = j + 1;
            }
        }
        System.out.println("\nSucursal de mayor recaudación: Sucursal " + sucursalMayor);

        scanner.close();
    }
}