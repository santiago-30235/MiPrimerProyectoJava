public class NumerosPares {
    public static void main(String[] args) {
        int cantidadPares = 0; 
        for (int num = 1; num <= 100; num++) { 
            if (num % 2 == 0) { 
                cantidadPares++; 
            }
        }

        
        System.out.println("En total hay " + cantidadPares + " números pares entre 1 y 100.");
    }
}