/**
*
*Tema 3. Ejercicio 2.
*Realiza un conversor en el que se introduzca por teclado una cantidad en euros y se muestre en pantalla esa misma cantidad expresada en pesetas.
*
*/
 public class EurosPesetas {
  public static void main(String[] args) {
  
    System.out.println("Este programa convierte una cantidad de euros introducida por teclado a pesetas.");
    System.out.println("Introduce una cantidad en euros, por favor:");
    
    int euros = Integer.parseInt(System.console().readLine());
    
    double pesetas = euros * 166.386;
    
    System.out.println(euros + " euros equivalen a " + (int)pesetas + " pesetas.");
    
  }
}
