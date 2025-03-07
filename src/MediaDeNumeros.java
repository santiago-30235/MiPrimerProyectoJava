import java.util.Scanner;

public class MediaDeNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa tres numeros para sacarles la media");

        System.out.println("ingresa el primer numero:");
        double num1 = scanner.nextDouble();

        System.out.println("ingresa el segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.println("ingresa el tercer numero:");
        double num3 = scanner.nextDouble();

        System.out.println("su primer numero es:"+ num1  +  " su segundo numero es:"+ num2  +  " y su tercer numero es:"+ num3 );

        double media1 = (num1+num2+num3);
        double media = media1/3;

        System.out.println("la media de los tres numeros es:" +media);



    }
}