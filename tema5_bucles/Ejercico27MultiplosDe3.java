/**
*Bucles
*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
*número leído por teclado.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico27MultiplosDe3 {
  public static void main(String[] args){
  
  int contadorMultiplos = 0;
  int sumatorioMultiplos = 0;
  
  
  System.out.println("Este programa muestra, cuenta y suma los números múltiplos de 3 que hay entre 1 y un número leído por teclado");
  System.out.println("Introduce un número, por favor:");
  int numero = Integer.parseInt(System.console().readLine());
  
  System.out.println("Los múltiplos de 3 que hay entre 1 y " + numero + " son: ");
  
  for ( int i = 0; i <= numero; i += 3 ){
    
    if (i != 0){
      
      System.out.print(i + "|");
      contadorMultiplos++;
      sumatorioMultiplos += i;
    
    }
  
  }
  
  System.out.println("\nEs decir, hay un total de " + contadorMultiplos + " múltiplos de 3 entre el 1 y el " + numero + "." );
  System.out.println("La suma de dichos múltiplos de 3 es: " + sumatorioMultiplos);
  
  }
}
