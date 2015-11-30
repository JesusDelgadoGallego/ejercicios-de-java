/**
*Bucles
*Realiza un programa que pida un número por teclado y que luego muestre ese número al
*revés.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico25NumeroAlReves {
  public static void main(String[] args){
    
    String numeroString;
    int longitud;
    int numero;
    
    System.out.println("Introduce un número entero, por favor:");
    
    numeroString = System.console().readLine();
    
    longitud = numeroString.length();
    
    numero = Integer.parseInt(numeroString);
    
    System.out.println("El número que has escrito vuelto del revés es:");
    
    for(int i = longitud; i > 0; i--){

      System.out.print(numero % 10);
      
      numero = numero /= 10;
      
    }
    
  }
}


