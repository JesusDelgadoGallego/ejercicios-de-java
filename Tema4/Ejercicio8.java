/**
* Sentencia múltiple (switch)
* Amplía el programa anterior para que diga la nota del boletín 
* (insuficiente, suficiente, bien,notable o sobresaliente).
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio8 {
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
      System.out.printf("Su nota media es de %.2f. ", media);
      if ((media >= 0) && (media < 5)) {
      System.out.println("Y su calicicacion de su boletin es de Insuficiente");
      } if ((media >= 5) && (media < 6)){
      System.out.println("Y su calicicacion de su boletin es de Sucifiente");
      } if ((media >= 6) && (media < 7)){
      System.out.println("Y su calicicacion de su boletin es de Bien");
      } if ((media >= 7) && (media < 9)){
      System.out.println("Y su calicicacion de su boletin es de Notable");
      } if ((media >= 9) && (media <= 10)){
      System.out.println("Y su calicicacion de su boletin es de Sobresaliente");
      } 
    } else {
      System.out.println("Las notas introducidas no son correctas.");
      }
  }
}
