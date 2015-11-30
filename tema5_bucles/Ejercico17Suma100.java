/**
* Bucles 
* Ejercicio17
* Realiza un programa que sume los 100 números siguientes a un número entero y positivo
* introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
* número positivo). 
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico17Suma100 {
  public static void main(String[] args){
    
    System.out.println("El programa pide por pantalla un número entero y positivo y muestra los 100 siguientes números.");
    System.out.println("Introduce un número entero y positivo, por favor:");
    
    int enteroPositivo = Integer.parseInt(System.console().readLine());
    
    if (enteroPositivo < 0) {
      do {
        System.out.println("Has introducido un número negativo. Introduce un número entero y positivo, por favor:");
        enteroPositivo = Integer.parseInt(System.console().readLine());
      } while (enteroPositivo < 0 );
    }
    for (int i = 1; i <= 100; i++) {
      System.out.println((enteroPositivo + i));
    }
    
  }
}
