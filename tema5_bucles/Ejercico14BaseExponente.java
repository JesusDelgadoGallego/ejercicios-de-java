/**
* Bucles 
* Ejercicio14
*Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
*potencia.
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico14BaseExponente {
  public static void main(String[] args){
    
    System.out.println("Este programa calcula la potencia de una base y un exponente introducidos por teclado.");
    System.out.println("Introduce la base, for favor(numero entero y positivo):");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el exponente, for favor(numero entero y positivo):");
    int exponente = Integer.parseInt(System.console().readLine());
    
    System.out.println( base +" elevado a " + exponente + " es igual a " + (int)(Math.pow(base, exponente)));
  }
}
