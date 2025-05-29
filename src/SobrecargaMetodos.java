public class SobrecargaMetodos {
    // Método sobrecargado
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        SobrecargaMetodos calc = new SobrecargaMetodos();
        System.out.println("Suma de dos enteros: " + calc.sumar(5, 10));
        System.out.println("Suma de dos doubles: " + calc.sumar(5.5, 10.5));
        System.out.println("Suma de tres enteros: " + calc.sumar(5, 10, 15));
    }
}
