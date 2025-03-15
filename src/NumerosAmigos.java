import java.util.Scanner;

public class NumerosAmigos {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.println("ingresa el num de inicio");
         int inicio = input.nextInt();
         System.out.println("ingresa el numero fin");
         int fin = input.nextInt();
        if (inicio > fin) {
            System.out.println("entrada no valida");
            input.close();
            return;
        
        }
        boolean encontrado = false;
        System.out.println(Math.max (2,inicio));
        for (int i = Math.max(2,inicio); i < fin; i++) {
            int ContadorDivisores = 0;
            int primerDivisor = 0;
            int segundoDivisor = 0;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    ContadorDivisores ++ ;
                    if (ContadorDivisores == 1) {
                        primerDivisor = j ;

                        
                    }else if (ContadorDivisores == 2) {
                        segundoDivisor = j ;
                    }else{
                       break;    
                    }    
                        
                    
                    
                }
                
            }
            if (ContadorDivisores == 2) {
                encontrado = true;
                System.out.println(i + " numero amigo " + primerDivisor + segundoDivisor);
                
            }
            if (!encontrado) {
                System.out.println(" no se encontraron numeros amigos ");
                
            }
            input.close();
        }
    }    
    
}