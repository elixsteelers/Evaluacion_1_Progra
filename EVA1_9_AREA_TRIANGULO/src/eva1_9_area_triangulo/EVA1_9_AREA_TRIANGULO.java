/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_area_triangulo;
import java.util.Scanner; 
/**
 *
 * @author invitado
 */
public class EVA1_9_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area; // es de tipo real (para numero con parte decimal)
        double alt;
        double base;
        Scanner cap =  new Scanner (System.in);
        System.out.println("Introduzca la base del triángulo");
        base=cap.nextDouble();
        System.out.println("Introduzca la altura del triángulo");
        alt=cap.nextDouble();
        area= (base*alt)/2;
        System.out.println("El área del triángulo es: "+area);
        
    }
    
}
