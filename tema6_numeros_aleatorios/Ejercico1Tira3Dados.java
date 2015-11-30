/**
*Números aleatorios
*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
*total (los puntos que suman entre los tres dados).
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico1Tira3Dados {
  public static void main(String[] args){
    
    int dado1= (int)(Math.random() * 6 + 1);
    int dado2= (int)(Math.random() * 6 + 1);
    int dado3= (int)(Math.random() * 6 + 1);
  
    System.out.println("Este programa muestra la tirada de 3 dados y su suma");
    
    System.out.printf("Dado 1: %4d\nDado 2: %4d\nDado 3: %4d\n", dado1, dado2, dado3);
    
    System.out.println("La suma de las tres tiradas es " + (dado1 + dado2 + dado3));
  
  }
}
