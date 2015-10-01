/**
* Tema 3
* Ejercicio 10
* @author Francisco Jesús Delgado Gallego
*/


public class MbaKb {
  public static void main(String[] args) {

    System.out.println(" Este programa realiza conversiones de Mb a Kb ");
    
    System.out.println(" Introduce el número de Megabytes, por favor:");
    int megas = Integer.parseInt(System.console().readLine());
    
    int totalKb = megas * 1024;
    
    System.out.println(megas + " Mb equivalen a " + totalKb + " Kb.");
    
  }
}
    
    
    
    
