/**
* Sentencia múltiple (switch)
* Realiza un programa que pida una hora por teclado y que muestre luego
* buenos días, buenas tardes o buenas noches según la hora. Se 
* utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. 
* Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
* 
* @author Alfonso Planas Guerrero
*/
public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca la hora del dia en forma de numero entero");
    int hora = Integer.parseInt(System.console().readLine());
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos dias");
    } else if ((hora >= 13) && (hora <= 20)){
      System.out.println("Buenas tardes");
    } else if ((hora >= 21) || (hora <= 5)){
      System.out.println("Buenas noches");
    } else {
      System.out.println("hora incorrecta");
    }    
  }
}
