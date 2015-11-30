/** 
 * Tema2
 * Ejercicio 3
 * Define tu nombre, dirección y teléfonos como variables y muéstralos por pantalla
 */

public class DatosComoVariables {
  public static void main(String[] args) {
    
    String nombre = "Francisco Jesús";
    String apellidos = "Delgado Gallego";
    String tlf = "649730991";
    String dir = " Calle Félix Gancedo, número 11, bloque 2, 1º c";
    
    System.out.println("Me llamo " + nombre + " " + apellidos);
    System.out.println("Mi teléfono es el " + tlf);
    System.out.println("Vivo en" + dir);
  }
}
