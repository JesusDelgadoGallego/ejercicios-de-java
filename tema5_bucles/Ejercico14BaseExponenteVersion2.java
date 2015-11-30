/**
* Bucles 
* Ejercicio14
*Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
*potencia.
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico14BaseExponenteVersion2 {
  public static void main(String[] args){
    
    System.out.println("Este programa calcula la potencia de una base y un exponente introducidos por teclado.");
    System.out.println("Introduce la base, for favor(número entero y positivo):");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el exponente, for favor(número entero):");
    int exponente = Integer.parseInt(System.console().readLine());
    int potencia = 1;

    if ( exponente >= 0 ) {
      for ( int i = 0; i < exponente ; i++ ) {
        potencia *= base;
      }
      System.out.println(base + " elevado a " + exponente + " es igual a " + potencia + " .");
    } else {
        for ( int i = 0; ( i < (exponente * (-1)) ); i++ ){
        potencia *= base;
        }
        System.out.println(base + " elevado a " + exponente + " es igual a " + (double)( 1 / (double)potencia ) + " .");
    }
  }
}
