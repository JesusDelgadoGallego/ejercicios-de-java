/**
* Arrays 
*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
*por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
*y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
*la lista generada anteriormente. Los números que se han cambiado deben aparecer
*entrecomillados.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio7Ocurrencias {
  public static void main(String[] args){
    
    int[] array20 = new int[100];
    
    for ( int i = 0; i < 100; i++ ) {
      
      array20[i] = (int)(Math.random() * 21);
    }
    
    for (int n: array20) {
      
      System.out.print( n + " " );
    }
    
    System.out.println();
    
    System.out.println("Introduce un valor de los que se han mostrado, por favor:");
    
    int valor1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el valor por el que quieras sustituirlo, por favor:");
    
    int valor2 = Integer.parseInt(System.console().readLine());
    
    
    for (int i = 0; i < 100; i++){
      
      if (array20[i] == valor1 ) {
        
        System.out.print("'" + valor2 + "'" + " ");
        
      } else {
        
        System.out.print( array20[i] + " ");
        
      }
      
    }

  }
}
    
