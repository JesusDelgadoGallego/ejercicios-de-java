/**
* Tema 3
* Ejercicio 5
* @author Francisco Jesús Delgado Gallego
*/

public class AreaRectangulo {
  public static void main(String[] args) {
    
    System.out.print("Este programa calcula el area de un rectángulo ");
    System.out.println("tras introducir por teclado cada uno de sus lados");
    
    System.out.print(" Introduce la longitud en centímetros del ");
    System.out.println("primer lado.");
    double lado1 = Double.parseDouble(System.console().readLine());
    
    System.out.print(" Introduce la longitud en centímetros del ");
    System.out.println("segundo lado.");
    double lado2 = Double.parseDouble(System.console().readLine());
    
    double area = lado1 * lado2;
    
    System.out.printf("El área del rectángulo es %.2f cm2.", area);
    
  }
}
    
    
    
    
    
    
