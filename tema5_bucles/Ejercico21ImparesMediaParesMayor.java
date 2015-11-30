/**
* Bucles 
* Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
* negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
* de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
* datos pero no se incluye en el cómputo.
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico21ImparesMediaParesMayor {
  public static void main(String[] args){
    
    System.out.println(" Este programa pide números por pantalla. Mientras estos sean positivos el programa los iŕa almacenando.");
    System.out.print(" Al introducir un número negativo, el programa dejará de pedir números y mostrará por pantalla (sin contar el número negativo )");
    System.out.println("el total de números introducidos, la media de los impares y el mayor de los pares. \n \n Introduce el primer número, por favor:");
    
    double numeroIntroducido = Double.parseDouble(System.console().readLine());
    int totalNumeros = 0;
    int totalNumerosImpares = 0;
    double mayorPar = 0;
    int numerosImpares = 0;
    while ( numeroIntroducido > 0 ) {
        if ( ( numeroIntroducido % 2 ) == 0 ) {
          
          if ( numeroIntroducido > mayorPar ) {
            
              mayorPar = numeroIntroducido;
          }
            
        } else {
            numerosImpares += numeroIntroducido;
            totalNumerosImpares++;
        }
        totalNumeros++;
        System.out.println(" Introduce el siguiente número positivo, por favor:");
        numeroIntroducido = Double.parseDouble(System.console().readLine());
        
    }
    
    System.out.println(" El último núemro que introduciste fue un ńumero negativo. Has introducido un total de " + totalNumeros + " números positivos.");
    System.out.println(" Has introducido un total de " + totalNumerosImpares + " números impares y su media es " + ( numerosImpares / totalNumerosImpares));
    System.out.println(" El mayor par introducido es " + mayorPar);
    
    
  }
}
