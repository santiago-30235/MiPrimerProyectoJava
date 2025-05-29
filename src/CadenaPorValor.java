//Crea un método que reciba una cadena de texto y trate de modificarla. Observa que las cadenas en Java son inmutables y no pueden ser modificadas dentro del método.

public class CadenaPorValor {

    // Método que intenta modificar la cadena
    public static void modificarCadena(String texto) {
        texto = texto + " modificado";  // Se crea una nueva cadena, no se cambia la original
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String mensaje = "Hola mundo";

        System.out.println("Antes de modificar: " + mensaje);

        modificarCadena(mensaje);  // No afecta la variable original

        System.out.println("Después de modificar: " + mensaje);
    }
}
