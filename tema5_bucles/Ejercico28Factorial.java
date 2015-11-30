/**
*Bucles
*Escribe un programa que calcule el factorial de un número entero leído por teclado.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico28Factorial {
  public static void main(String[] args){
    
    
    
    System.out.println("Introduce un número entero y positivo, por favor:");
    int numero = Integer.parseInt(System.console().readLine());
    
    if(numero < 0){
      do {
        System.out.println("El número introducido no es correcto. Introduzca un número entero y positivo, por favor:");
        numero = Integer.parseInt(System.console().readLine());
        
      } while (numero < 0);
    }
    
    int factorial = numero;
    
    if (numero == 0){
      
      System.out.println("El factorial de " + numero + " es igual a 1.");
      
    } else {
      
      for (int i = 1; i < numero; i++){
        
        factorial *= i;
        
      }
      System.out.println("El factorial de " + numero + " es: " + factorial);
    }
  
    
  
  }
}
