import java.util.Scanner;

public class VentasMensuales_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] ventas = {
    {100, 150, 130}, // Ventas del producto 1 en enero, febrero y marzo
    {90, 120, 110},  // Ventas del producto 2 en enero, febrero y marzo
    {200, 180, 160}  // Ventas del producto 3 en enero, febrero y marzo
};

// Total de ventas en febrero para el producto 2
System.out.println("Ventas de febrero para el producto 2: " + ventas[1][1]);
    }
}
