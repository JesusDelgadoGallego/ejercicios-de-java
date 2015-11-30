/**
* Bucles 
* Ejercicio12
*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
*término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
*anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
*144... El número n se debe introducir por teclado
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico12Fibonacci {
  public static void main(String[] args){
    System.out.println("Este programa muestra los ´n´ primeros términos de la serie de Fibonacci. ");
    System.out.println("Introduce por teclado el valor de ´n´, por favor: ");
    
    int n = Integer.parseInt(System.console().readLine());
    
    while (n <= 0) {
      System.out.println("Dato erróneo. Introduce un número positivo y mayor que cero:");
      n = Integer.parseInt(System.console().readLine());
    }
    
    switch( n ) {
      case 1:
        System.out.print("0");
        break;
        
      case 2:
        System.out.print("0 1");
        break;
        
      default:
      
          int f1 = 0;
          int f2 = 1;
          int aux;
          System.out.print("0 1");
          
        while ( n > 2 ) {
          aux = f1;
          f1 = f2;
          f2 = f2 + aux;
          System.out.print(" " + f2 );
          n--;
        }
    } //switch
    
  }
}
