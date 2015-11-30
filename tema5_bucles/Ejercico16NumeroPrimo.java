/**
* Bucles 
* Ejercicio16
* Escribe un programa que diga si un número introducido por teclado es o no primo. Un
* número primo es aquel que sólo es divisible entre él mismo y la unidad.. 
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico16NumeroPrimo {
  public static void main(String[] args){
    
    System.out.println("Este programa averigua si el número introducido por teclado es o no primo.");
    System.out.println("Introduce un número entero, por favor.");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    boolean primo = true;
    
    for (int i = 2; i < numero; i++ ) {
      if ( (  numero % i ) == 0 ) {
        primo = false;
      }
    }
    
    if (primo) {
      System.out.println("El " + numero + " es primo.");
    } else {
      System.out.println("El " + numero + " no es primo.");
    }
    
  }
}
