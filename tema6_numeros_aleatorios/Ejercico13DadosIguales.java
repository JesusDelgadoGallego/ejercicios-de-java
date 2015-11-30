/**
*Números aleatorios
*Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
*tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
*valor.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico13DadosIguales {
  public static void main(String[] args){
    
    System.out.println("Este programa realiza una tirada de dos dados hasta que el resultado de ambos sea el mismo.\n");
    
    int dado1;
    int dado2;
    int iteraciones = 0;
  
    do {
      
    dado1= (int)(Math.random() * 6 + 1);
    dado2= (int)(Math.random() * 6 + 1);
    
    System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2 + "\n\n");
    
    iteraciones++;
    
    
    } while (dado1 != dado2);
    
    System.out.println("Se han necesitado " + iteraciones + " tiradas.");
    
    
  
  }
}
