/**
* Arrays 
*Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
*los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
*1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
*posición 0. Finalmente, muestra el contenido del array.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio6ArrayRotacion {
  public static void main(String[] args){
    
    
    System.out.print("Este programa pide 15 números por teclado, ");
    System.out.println ("los introduce en un array, rota las posiciones de dichos numeros en una unidad y después muestra el resultado");
    
    double[] quinceNumeros = new double[15];
    
    for (int i = 0; i <= 14; i++ ) {
      
      System.out.println("Introduce número, por favor:");
      quinceNumeros[i] = Double.parseDouble(System.console().readLine());
      
    }
    
    System.out.println();
    
    //Rota el array una posición hacia la derecha. La última posición es ahora la primera
    
    double aux = quinceNumeros[14];
    
    for (int i = 14; i > 0; i-- ){
      
      quinceNumeros[i] = quinceNumeros[i -1];
    }
    
    quinceNumeros[0] = aux;
    
    for (double n: quinceNumeros){
      System.out.println(n);
    }

  }
}
