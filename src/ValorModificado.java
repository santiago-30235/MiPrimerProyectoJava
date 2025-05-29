//Escribe un método que reciba un entero, lo modifique y lo devuelva. Observa cómo el valor original no se modifica a menos que uses el valor retornado.
public class ValorModificado {

    // Método que incrementa el valor y lo devuelve
    public static int incrementar(int x) {
        x = x + 1;
        return x;
    }

    public static void main(String[] args) {
        int x = 5;

        System.out.println("Valor original de x: " + x);

        // Llamada sin usar el valor retornado
        incrementar(x);
        System.out.println("Después de llamar a incrementar(x) SIN guardar el resultado: " + x);

        // Llamada usando el valor retornado
        x = incrementar(x);
        System.out.println("Después de llamar a incrementar(x) Y guardar el resultado: " + x);
    }
}

