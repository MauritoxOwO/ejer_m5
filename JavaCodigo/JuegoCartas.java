package juegocartas;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Juegocartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int dinero = 200;
        double carta = 0;
        char respuesta = ('u');
        double carta1;
      
        
    while(dinero != 0){
        respuesta = ('u');
        carta = 0;
        
        System.out.println("Tienes "+dinero+" €");
        System.out.println("Ingresa el dinero que quieres apostar");
        int apuesta = teclat.nextInt();
        
        dinero = dinero - apuesta;
        
        System.out.println("Ahora tienes "+dinero+" €");
        System.out.println("Empieza el juego");
        

        while(carta < 7.5 && respuesta != ('s')){
            int numero = (int) (Math.random()*10+1);
    
               if (numero <= 7){
               carta1 = numero;
               carta = carta + carta1;}
               
               else if(numero > 7){
               carta1 = 0.5;
               carta = carta + carta1;}
                
            System.out.println("Tienes en mano "+carta);
            
            if(carta < 7.5){
            System.out.println("¿Te plantas? [s/n]");
            respuesta = teclat.next().toLowerCase().charAt(0);}
            
            else if(carta >= 7.5){
                respuesta = ('s');
            }
            
            
            }
 
        if(carta > 7.5){
            System.out.println("Has perdido.");
            System.out.println("Te quedan "+dinero);}
   
        else if(carta == 7.5){
            dinero = dinero + (apuesta*2);
            System.out.println("¡Ganaste! Ahora tienes "+dinero+"€");
            System.out.println("Te quedan "+dinero+"€");}
        
        else if(respuesta==('s')){
            System.out.println("El jugador se planta");
            dinero = dinero + apuesta;}
   
        
        }
        
    }
}
