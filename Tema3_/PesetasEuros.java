/**
* Tema 3
* Ejercicio 3
* @author Francisco Jesús Delgado Gallego
*/

 public class PesetasEuros {
  public static void main(String[] args) {
  
    System.out.println("Este programa convierte una cantidad de pesetas introducida por teclado a euros.");
    System.out.println("Introduce una cantidad en pesetas, por favor:");
    
    int pesetas = Integer.parseInt(System.console().readLine());
    
    double euros = pesetas / 166.386;
    
    System.out.printf("  %d pesetas qeuivalen a %.2f euros.", pesetas, euros);
    
  }
}
