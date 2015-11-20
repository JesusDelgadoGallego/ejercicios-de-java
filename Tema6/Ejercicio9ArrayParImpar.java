/**
* Arrays 
*Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
*con la palabra “par” o “impar” según proceda.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio9ArrayParImpar {
  public static void main(String[] args){
    
    int[] ochoEnteros = new int[8];
    
    for (int i = 0; i < 8; i++){
      
      System.out.println("Introduce número entero, por favor: ");
      ochoEnteros[i] = Integer.parseInt(System.console().readLine());
      
    }
    
    for (int i = 0; i < 8; i++) {
      
      if ( (ochoEnteros[i] %2) == 0){
        
        System.out.println( "\n" + ochoEnteros[i] + " PAR");
        
      } else {
        
        System.out.println( "\n" + ochoEnteros[i] + " IMPAR");
        
      }
      
    }
  
  }
}
