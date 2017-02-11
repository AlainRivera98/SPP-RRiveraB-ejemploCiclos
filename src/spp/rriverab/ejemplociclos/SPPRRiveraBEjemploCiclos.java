
package spp.rriverab.ejemplociclos;
import java.util.Scanner;

public class SPPRRiveraBEjemploCiclos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero = 0;
        boolean flag;

        do{      
            try{
                System.out.println("\nIntroduce un número entero");
                numero = teclado.nextInt(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("El número insertado no es entero\n" +ex);   
            } 
            teclado.nextLine();
        }while(flag==false);
        
        System.out.println(numero+" si es un entero");
        
        
    }
    
}
