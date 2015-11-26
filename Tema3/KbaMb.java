/**
* Tema 3
* Ejercicio 11
* @author Francisco Jesús Delgado Gallego
*/


public class KbaMb {
  public static void main(String[] args) {

    System.out.println(" Este programa realiza conversiones de Kb a Mb ");
    
    System.out.println(" Introduce el número de Megabytes, por favor:");
    int kilobytes = Integer.parseInt(System.console().readLine());
    
    int totalMb = kilobytes / 1024;
    
    System.out.println(kilobytes + " Kb equivalen a " + totalMb + " Mb.");
    
  }
}
