import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    /*
    Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la 
    cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
    según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("cantidad de preguntas realizadas");
        float pregRealizadas = scanner.nextFloat();
        System.out.println("cantidad de preguntas contestadas correctamente");
        float pregContestadas = scanner.nextFloat();

        
        float porcentaje = (pregContestadas/pregRealizadas)*100;
        System.out.println("el nivel es " +porcentaje);


        if (porcentaje>=90) {
            System.out.println("Nivel maximo");

               
            } else {
                if ((porcentaje>=75) & (porcentaje<90)) {
                    System.out.println("Nivel medio");
            }

            
             else {    
                if ((porcentaje>=50) & (porcentaje<75)) {
                    System.out.println("Nivel regular");

            }else{
                if (porcentaje<50) {
                    System.out.println("Fuera de nivel");
                } 

            }

           
            
        }
        
        
      
        }    
        
        

    }
}
