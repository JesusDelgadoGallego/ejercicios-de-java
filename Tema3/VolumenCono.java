/**
* Tema 3
* Ejercicio 9
* @author Francisco Jesús Delgado Gallego
*/


public class VolumenCono {
  public static void main(String[] args) {

    System.out.print(" Este programa calcula el volumen de un cono a ");
    System.out.println("partir de su radio y su altura." );
    
    
    System.out.print(" Introduce la altura del cono, en centímetros ");
    System.out.print(", por favor:");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.print(" Introduce el radio del cono, en centímetros ");
    System.out.print(", por favor:");
    double radio = Double.parseDouble(System.console().readLine());
    
    double area = (Math.PI)/3 * (Math.pow(radio, 2) * altura);
    
    System.out.printf("El volumen del cono son %.2f cm3", area);
    
  }
}
