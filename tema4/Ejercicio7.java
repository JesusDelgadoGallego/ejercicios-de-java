/**
* Sentencia múltiple (switch)
* Realiza un programa que calcule la media de tres notas.
* @author Alfonso Planas Guerrero
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
    if ((media >= 0) && (media <= 10)) {
      System.out.printf("Su nota media es de %.2f", media);
    } else {
      System.out.println("Las notas introducidas no son correctas");
    }    
  }
}
