/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_inicializacion;

/**
 *
 * @author invitado
 */
public class EVA1_11_INICIALIZACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //los parentesis denotan una funcion:
       //printIn()---funcion
       //main()---funcion
        System.out.println("Hola mundo"); 
        int valor= 0;//inicializar la variable para usarla
        System.out.println(valor);
      //declaramos e inicializamos 3 variables del mismo tipo
        double  salario = 0 , iva= 0.16 , subtotal= 10000;
        
        final int CALIFA_PASAR=70;//usar constantes en mayus
        final String ESCUELA= "Instituto Tecnológico de Chihuahua II";
         System.out.println(ESCUELA);
         System.out.println("La calificació mínima para pasar es: " + CALIFA_PASAR);
        //error: solo se puede asignar una sola vez
        //califa_pasar=100;
        //califa_pasar=20;
        
        /*
        IGNORA
        VARIAS LÍNEAS DE TEXTO
        */
        int x;//esto ya es ignorado por el cuadro
        
        byte valores=120;
        //valores = 128;
        int Valor= Integer.MAX_VALUE;
        System.out.println(Valor+1);
    }
    
}
