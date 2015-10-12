/**
* Sentencia múltiple (switch)
* Realiza un programa que calcule la media de tres notas.
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al programa de calculo de notas");
    System.out.println("Por favor, introduzca su primera nota");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduzca su segunda nota");
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduzca su tercera nota");
    double c = Double.parseDouble(System.console().readLine());
    double media = ((a + b + c)/3);
    if ((a >= 0) && (a <= 10) && 
       (b >= 0) && (b <= 10) &&
       (c >= 0) && (c <= 10)) {
      System.out.printf("Su nota media es de %.2f", media);
    } else {
      System.out.print("Las notas introducidas no son correctas.");
      System.out.println(" Introduce notas comprendidas entre 0 y 10");
    }    
  }
}
