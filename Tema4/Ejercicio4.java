/**
* Ejercicio4
*
* Vamos a ampliar uno de los ejercicios de la relación anterior para 
* considerar las horas extras. Escribe un programa que calcule el 
* salario semanal de un trabajador teniendo en cuenta que las horas 
* ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
* A partir de la hora 41, se pagan a 16 euros la hora.
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio4 {
  public static void main(String[] args) {
    String linea;
    int eurosPorHora= 12;
    System.out.println("Bienvenidos al programa de calculo de salario.");
    System.out.println("Por favor, introduzca el numero de horas trabajadas esta semana: ");
    int x = Integer.parseInt(System.console().readLine());
    if (x <= 40) {
      System.out.println("Ha ganado un salario de " + (x * 12) +"euros");
    } else {
      System.out.println("Ha ganado un salario de " + (480 + ( ( x - 40 ) * 16 ) ));
    }
    
  }
}
