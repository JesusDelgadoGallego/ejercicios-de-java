/**
* Tema 3
* Ejercicio 8
* @author Francisco Jesús Delgado Gallego
*/


public class TotalSueldo {
  public static void main(String[] args) {

    System.out.print(" Este programa calcula el salario semanal de un ");
    System.out.print("empleado en base a las horas trabajadas. A " );
    System.out.println("razón de 12 euros la hora.");
    
    System.out.println("Introduce el número de horas trabajadas, por favor");
    int horas = Integer.parseInt(System.console().readLine());
    
    int totalSueldo = horas*12;
    
    System.out.println("Tu salario semanal son " + totalSueldo + " euros." );
    
  }
}
