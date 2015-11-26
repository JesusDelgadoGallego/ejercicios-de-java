/**
* Arrays 
*Escribe un programa que pida 10 números por teclado y que luego muestre los números
*introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
*respectivamente.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio5ArrayMaxMin {
  public static void main(String[] args){
    
    System.out.print("El programa pide 10 números por teclado. ");
    System.out.println("Después muestra dichos números especificando cúal de ellos es el mínimo y el máximo.");
    
    double[] numeros = new double[10];
    double minimo = 0;
    double maximo = 0;
    
    
    
    for (int i = 0; i <= 9; i++) {
      
      System.out.println("Introduce número, por favor:");
      numeros[i] = Double.parseDouble(System.console().readLine());
      
    }
    
    minimo = numeros[0];
    maximo = numeros[0];
    
    for (int i = 0; i <= 9; i++ ) {
      

      if (numeros[i] <= minimo) {
        
        minimo = numeros[i];
      }
      
      if (numeros [i] >= maximo ) {
        
        maximo = numeros[i];
      }
      
    }
    
    
    for (int i = 0; i <= 9; i++) {
      
      
      if (numeros[i] == maximo){
        
        System.out.println(numeros[i] + " MÁXIMO");
      } else if (numeros[i] == minimo) {
        
        System.out.println( numeros[i] + " MÍNIMO");
        
      } else {
          
          System.out.println( numeros[i]);
      }
    }
    
    
  }
}
