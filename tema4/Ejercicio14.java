/**
* Sentencia múltiple (switch)
* 
* Realiza un programa que diga si un número introducido por teclado es
* par y/o divisible entre 5.
* 
* @author Alfonso Planas Guerrero
*/
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca un numero entero");
    int n = Integer.parseInt(System.console().readLine());
    if ((n%2)==0) {
      System.out.println("El numero es par");
    }
    if ((n%5)==0){
      System.out.println("El numero es divisible entre 5");
    }  
  }
}
