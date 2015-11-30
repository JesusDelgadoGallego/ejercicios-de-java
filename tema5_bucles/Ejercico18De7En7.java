/**
* Bucles 
* Escribe un programa que obtenga los números enteros comprendidos entre dos números
* introducidos por teclado y validados como distintos, el programa debe empezar por el
* menor de los enteros introducidos e ir incrementando de 7 en 7. 
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico18De7En7 {
  public static void main(String[] args){
    
    System.out.print("El programa pide dos números enteros por teclado. Los ordena ");
    System.out.println("e imprime los enteros comprendidos entre el menor y el mayor contando de 7 en 7.");
    System.out.println("Introduce el primer número entero, por favor");
    double primerNumero = Double.parseDouble(System.console().readLine());
    if ( (primerNumero) / ((int)(primerNumero)) != 1 ) {
      do {
        System.out.println("Dato erróneo. Introduce un número entero por favor.");
        primerNumero = Double.parseDouble(System.console().readLine());
      } while ( (primerNumero) / ((int)(primerNumero)) != 1 );
    }
    
    System.out.println("Introduce el segundo número entero, por favor");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    if (( (segundoNumero) / ((int)(segundoNumero)) != 1 ) || ( primerNumero == segundoNumero )) {
      do {
        System.out.println("Dato erróneo. Introduce un número entero y distinto del primer número introducido.");
        segundoNumero = Double.parseDouble(System.console().readLine());
      } while (( (segundoNumero) / ((int)(segundoNumero)) != 1 ) || ( primerNumero == segundoNumero) );
    }
    
    if ( primerNumero > segundoNumero ) {
      double aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for (double i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.println((int)primerNumero);
      primerNumero += 7 ;
    }
   
  }
}
