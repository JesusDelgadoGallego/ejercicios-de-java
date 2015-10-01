/**
* Tema 3
* Ejercicio 6
* @author Francisco Jesús Delgado Gallego
*/

public class AreaTriangulo {
  public static void main(String[] args) {
    
    System.out.print(" Este programa calcula el area de un triángulo ");
    System.out.print("tras introducir por teclado la longitud de su ");
    System.out.println("base y de su altura.");
    
    System.out.print(" Introduce la longitud en centímetros de ");
    System.out.println("la base.");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print(" Introduce la longitud en centímetros de ");
    System.out.println("la altura.");
    double altura = Double.parseDouble(System.console().readLine());
    
    double area = ((base * altura)/2);
    
    System.out.printf("El área del triángulo es %.2f cm2.", area);
    
  }
}
