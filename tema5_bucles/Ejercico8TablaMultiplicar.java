/**
* Bucles 
* Ejercicio8
* Muestra la tabla de multiplicar de un número introducido por teclado
* 
*
*
* @author Jesús Delgado Gallego
*/



public class Ejercico8TablaMultiplicar {
  public static void main(String[] args){
    
    System.out.println("Introduce un número entero. El programa muestra su tabla de multiplicar");
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i <= 10; i ++ ) {
      System.out.println( numero + " x " + i + " = " + (numero * i) );
    }
  }
}
