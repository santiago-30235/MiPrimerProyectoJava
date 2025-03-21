import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    //Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
    //mensaje en pantalla indicando que debe abonar impuestos.
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresar sueldo");
        int sueldo = scanner.nextInt();

        if (sueldo>3000) {
           System.out.println("abonar impuestos"); 
        } else {
            
        }
    }
}
