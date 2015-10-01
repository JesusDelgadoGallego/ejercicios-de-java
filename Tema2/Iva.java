/**
* Tema 2
* Ejercicio 6
* @author Francisco Jesús Delgado Gallego
*/

public class Iva {
  public static void main(String[] args) {
    
    double baseImponible = 64.25;
    double iva = (baseImponible / 100) * 21;
    double totalFactura = baseImponible + iva;
    System.out.println("\033[32m");
    System.out.printf("Si el precio sin IVA de mi factura es de %.4f €. El total a pagar ,con IVA incluído, será %.4f €.",baseImponible , totalFactura);
    System.out.println("\033[37m");
  }
}
