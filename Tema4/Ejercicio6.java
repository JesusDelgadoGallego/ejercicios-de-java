/**
* Sentencia múltiple (switch)
* Realiza un programa que calcule el tiempo que tardará en caer un 
* objeto desde una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s 2
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al programa de calculo de caida libre");
    System.out.println("Por favor, introduzca la altura en m desde la cual su objeto caera");
    double h = Double.parseDouble(System.console().readLine());
    double tiempo = Math.sqrt(2 * h / 9.81);
    if (h<0) {
      System.out.println("La altura de caida no puede ser negativa");
    } else {
      System.out.printf("El objeto tardara %.2f s en caer", tiempo);
    }    
  }
}
