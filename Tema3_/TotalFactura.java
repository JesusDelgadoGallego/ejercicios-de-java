/**
* Tema 3
* Ejercicio 7
* @author Francisco Jesús Delgado Gallego
*/


public class TotalFactura {
  public static void main(String[] args) {

    System.out.print(" Este programa calcula el total de la factura a partir ");
    System.out.println("de la base imponible");
    
    System.out.println(" Introduce el precio sin iva:");
    double base = Double.parseDouble(System.console().readLine());
    
    double total = (base/100)*21 + base;
    
    System.out.printf("El total de la factura es %.2f", total);
    
  }
}
    
    
