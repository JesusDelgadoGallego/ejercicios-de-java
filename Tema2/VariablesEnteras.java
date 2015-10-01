/**
*@author Francisco Jesús Delgado Gallego
*Definición de variables, salida de datos por pantalla y operaciones simples
*Ejercicio 1. Tema 2
* 
*/

public class VariablesEnteras {
  public static void main(String[] args) {
    
    System.out.println("\033[33m");
    
    int x = 144;
    int y = 999;
    System.out.println("El valor de mi variable x es " + x);
    System.out.println("El valor de mi variable y es " + y);
    int suma = x + y;
    System.out.println("La suma de las variables x e y es " + suma);
    int resta = x - y;
    System.out.println("La resta de las variables x e y es " + resta);
    int mult = x * y;
    System.out.println("La multiplicación de las variables x e y es " + mult);
    double div = (double) x / (double) y;
    System.out.println("La división entre las variables x e y es " + div);
    
    System.out.println("\033[37m");
  }
}
  
