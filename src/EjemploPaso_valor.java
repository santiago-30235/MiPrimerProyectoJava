import java.util.Scanner;

public class EjemploPaso_valor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = 10;
        cambiarValor(valor);
        System.out.println("Valor después de cambiarValor: " + valor);  // Debería imprimir 10
    }

    public static void cambiarValor(int valor) {
        valor = 20;
    }
}


    
