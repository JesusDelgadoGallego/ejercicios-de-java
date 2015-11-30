/**
* Bucles 
* Ejercicio13
*Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
*y cuántos son negativos.
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico13ListaPositivosNegativos {
  public static void main(String[] args){
    
    System.out.println("El siguiente programa te pedirá que introduzcas 10 números por pantalla. ");
    System.out.println("Después te mostrará por pantalla cuántos de los números introducidos son positivos y cuántos son negativos.");
    int positivos = 0;
    int negativos = 0;
    
    for (int i = 1; i <=10; i++) {
      double numeroIntroducido = Double.parseDouble(System.console().readLine());
      if (numeroIntroducido >= 0) {
        positivos++;
      } else {
        negativos++;
      }
    }
    
    System.out.println("Has introducido " + positivos + " números positivos y " + negativos + " números negativos.");
    
  }
}
