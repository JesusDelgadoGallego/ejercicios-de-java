/**
* Escribe un programa que dada una hora determinada (horas y minutos), calcule los 
* segundos que faltan para llegar a la medianoche.
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca la hora actual en forma de numero entero (0 a 23)");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduzca los minutos actuales en forma de numero entero (0 a 59)");
    int minuto = Integer.parseInt(System.console().readLine());
    if ((hora >= 0 ) && ( hora <= 23 ) && (minuto >= 0) && ( minuto <= 59 )) {
      System.out.println("Faltan" + (86400 - (hora * 60 * 60) -   (minuto * 60) + "segundos para la media noche"));
    } else {
      System.out.println("La hora introducida no es correcta");
    }
  }
}
