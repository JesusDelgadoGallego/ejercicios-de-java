/**
* Bucles 
* Escribe un programa que permita ir introduciendo una serie indeterminada de números
* mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
* total acumulado, el contador de los números introducidos y la media.
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico23MediaContador10000 {
  public static void main(String[] args){
    
    System.out.println("El programa pide números por teclado. ");
    System.out.println("Cuando su suma supera 10000, el programa mostrará el total de números introducidos, su suma y su media. ");
    System.out.println("Introduce el primer número, por favor:");
    
    double numeroIntroducido = Double.parseDouble(System.console().readLine());
    double totalNumeros = 0;
    double contador = 0;

    for (double i = numeroIntroducido; i < 10000; i+=numeroIntroducido) {
      
      System.out.println("Introduce el siguiente número, por favor:");
      numeroIntroducido = Double.parseDouble(System.console().readLine());
      contador++;
      totalNumeros = i;
    }
    
    System.out.print("Has introducido un total de " + contador + " números positivos. Su suma es igual a " + totalNumeros );
    System.out.println(" y su media es igual a " + ( totalNumeros / contador ));
    
    
    
    
  }
}
