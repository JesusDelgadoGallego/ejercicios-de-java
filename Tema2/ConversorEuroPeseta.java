/** 
 * Tema 2
 * Ejercicio 4
 *
 *
 */

public class ConversorEuroPeseta {
  public static void main(String[] args) {
  
    double cantidadEuros = 15;
    double euroEnPesetas = 166.386;
    double quinceEurosEnPesetas = cantidadEuros * euroEnPesetas;
    System.out.println("\033[31m");
    System.out.println("Una cantidad de " + (int) cantidadEuros + " € equivale a " + quinceEurosEnPesetas + " pesetas");
    System.out.println("\033[37m");
  }
}
