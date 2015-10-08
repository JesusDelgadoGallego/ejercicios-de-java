/**
* Sentencia múltiple (switch)
* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al programa de calculo de ecuaciones ax + b = 0");
    System.out.println("Por favor, introduzca el valor a");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduzca el valor b");
    double b = Double.parseDouble(System.console().readLine());
    if (a==0) {
      System.out.println("Esta ecuacion no tiene solucion");
    } else {
      System.out.println("X=" + (-b/a));
    }    
  }
}
