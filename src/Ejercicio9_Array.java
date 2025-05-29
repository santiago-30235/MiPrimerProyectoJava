import java.util.Scanner;
//Queremos guardar la temperatura mínima y máxima de 5 días. realiza un programa que de la siguiente información:

//- La temperatura media de cada día
//- Los días con menos temperatura
//- Se lee una temperatura por teclado y se muestran los días cuya temperatura máxima coincide con ella. si no existe ningún día se muestra un mensaje de información.

public class Ejercicio9_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tempMin = new double[5];
        double[] tempMax = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }

        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media);
        }

        double menorTemp = tempMin[0];
        for (int i = 1; i < 5; i++) {
            if (tempMin[i] < menorTemp) {
                menorTemp = tempMin[i];
            }
        }
        System.out.println("\nDías con menor temperatura mínima (" + menorTemp + "):");
        for (int i = 0; i < 5; i++) {
            if (tempMin[i] == menorTemp) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("\nIntroduce una temperatura máxima para buscar: ");
        double tempBusqueda = scanner.nextDouble();
        boolean encontrado = false;
        System.out.println("Días con temperatura máxima igual a " + tempBusqueda + ":");
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == tempBusqueda) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay días con esa temperatura máxima.");
        }

        scanner.close();
    }
}