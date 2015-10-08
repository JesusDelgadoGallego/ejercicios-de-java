/**
* Sentencia múltiple (switch)
* 
* Escribe un programa que diga cuál es la última cifra de un número 
* entero introducido por teclado.
* 
* @author Alfonso Planas Guerrero
*/
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca un numero entero");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("La ultima cifra de su numero es " + (x%10));
  }
}
