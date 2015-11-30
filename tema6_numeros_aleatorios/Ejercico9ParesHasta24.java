/**
*Números aleatorios
*Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
*termine de generar números hasta que no saque el 24. El programa deberá decir al final
*cuántos números se han generado.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico9ParesHasta24 {
  public static void main(String[] args){
    
    int numeroAleatorio;
    int contadorPares = 0;
    
    System.out.print("Este programa genera números pares hasta generar un 24.");
    System.out.println(" Al final hace un recuento del total de números mostrados");
    
    do {
      
      numeroAleatorio = (int)(Math.random() *101);
      
      if(numeroAleatorio % 2 == 0){
        
        System.out.print( numeroAleatorio + " | ");
        contadorPares++;
        
      }
      
      
    } while (numeroAleatorio != 24);
    
    System.out.print("El programa ha generado " + contadorPares + " números pares.");
    
  
  }
}
