/**
* Arrays 
*Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
*inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio3ArrayInverso {
  public static void main(String[] args){
    
    System.out.println("Este programa te pedirá diez numeros enteros por pantalla y luego te los mostrará en orden inverso.");
    
    int[] array1 = new int[10];
    
    for (int i = 9; i >= 0; i--) {
      
      System.out.println("Introduce un número entero:");
      array1[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int n: array1) {
      
      System.out.print(n + " ");
    }
  
  }
}
