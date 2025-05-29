public class MetodoIntercambiar {
   // Escribe un programa que tenga un método llamado intercambiar que intente intercambiar los valores de dos variables enteras, pero sin éxito (ya que en Java los tipos primitivos se pasan por valor).

    // Método que intenta intercambiar los valores (no tendrá efecto real fuera del método)
    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Dentro del método: x = " + x + ", y = " + y);
    }

    // Método principal
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes de llamar al método: a = " + a + ", b = " + b);
        intercambiar(a, b);
        System.out.println("Después de llamar al método: a = " + a + ", b = " + b);
    }
}
