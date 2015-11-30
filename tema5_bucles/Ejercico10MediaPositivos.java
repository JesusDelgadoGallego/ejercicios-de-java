/**
* Bucles 
* Ejercicio10
* Escribe un programa que calcule la media de un conjunto de números positivos introduci-
* dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
* indicará que ha terminado de introducir los datos cuando meta un número negativo.
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico10MediaPositivos {
  public static void main(String[] args){
    System.out.print("Este programa calcula la media de números positivos introducidos por teclado. ");
    System.out.print("Cuando quieras calcular la media de los números positivos introducidos hasta el ");
    System.out.println("momento, introduce un número negativo.");
    System.out.println("Introduce el primer número positivo, por favor:");
    double numero = Double.parseDouble(System.console().readLine());
    double i = 0;
    double total = 0;
    do {
      if (numero >=  0) {
        total += numero;
        System.out.println("Introduce el siguiente número, por favor:");
        numero = Double.parseDouble(System.console().readLine());
        i++;
      }
    } while (numero >= 0);
    
    System.out.println("Has introducido un total de " + (int)i + " números positivos y su media es " +  ( total / i ) ) ;
  }
}
