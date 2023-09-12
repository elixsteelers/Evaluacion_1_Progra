/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_entradas_salidas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADAS_SALIDAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int year;
        double precio; 
        //input es una varaible tipo scanner
        //scanner: es una herramienta de java para capturar info
        //new= se esta creando
        Scanner cap= new Scanner(System.in);
        //hay un paquete System, dentro de un paquete out, y dentro
        //de out, la instrucción printIn
        System.out.println("Introduce la marca");
        marca= cap.nextLine();
        System.out.println("Introduce el modelo");
        modelo= cap.nextLine();
        System.out.println("Introduce la año");
        year= cap.nextInt();
        System.out.println("Introduce la precio");
        precio= cap.nextDouble();
        System.out.println( marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
       
    }
    
}
