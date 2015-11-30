/**
*Bucles
*Escribe un programa que muestre por pantalla todos los números enteros positivos menores
*a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico29MenoresNoDivisibles {
  public static void main(String[] args){
  
    System.out.println("Introduce un número entero y positivo, por favor:");
    double primerNumero = Double.parseDouble(System.console().readLine());
    if (((primerNumero) / ((int)(primerNumero)) != 1 ) || ( primerNumero <= 0 )){
      do {
        System.out.println("Dato erróneo. Introduce un número entero  y positivo, por favor.");
        primerNumero = Double.parseDouble(System.console().readLine());
      } while (((primerNumero) / ((int)(primerNumero)) != 1 ) || ( primerNumero <= 0 ));
    }
  
    System.out.println("Introduce un segundo número entero, positivo y menor que el primer número, por favor:");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    if (((segundoNumero) / ((int)(segundoNumero)) != 1 ) || ( segundoNumero <= 0 ) || (segundoNumero > primerNumero)){
      do {
        System.out.println("Dato erróneo. Introduce un número entero, positivo y menor que el primer número, por favor:");
        segundoNumero = Double.parseDouble(System.console().readLine());
      } while (((segundoNumero) / ((int)(segundoNumero)) != 1 ) || ( segundoNumero <= 0 ) || (segundoNumero > primerNumero));
    }
    
    System.out.print("Los números enteros y positivos menores que " + (int)primerNumero + " y que NO son divisibles entre " + (int)segundoNumero + " son: |");
    
    
    for (double i = 1; i < primerNumero; i ++){
      
      if ((i % segundoNumero) != 0){
        
        System.out.print((int)i + "|");
        
      }
      
    }
  }
}
