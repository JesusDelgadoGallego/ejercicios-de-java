/**
 * Tema 2
 * Ejercicio 5
 * @author Francisco Jesús Delgado Gallego
 */

public class ConversorPesetaEuro {
  public static void main(String[] args) {
  
    int pesetas = 50000;
    double euro = 166.386;
    double cantidadEnEuros = pesetas / euro;
    System.out.println("\033[35m");
    System.out.println(" La cantidad de " + pesetas + " pesetas equivale a " + cantidadEnEuros + " euros");
    System.out.println("\033[37m");
  }
}
