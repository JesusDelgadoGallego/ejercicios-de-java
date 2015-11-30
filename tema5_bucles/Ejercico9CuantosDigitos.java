/**
* Bucles 
* Ejercicio9
* Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
* 
*
*
* @author Jesús Delgado Gallego
*/



public class Ejercico9CuantosDigitos{
  public static void main(String[] args){
    
    System.out.println("Introduce un ńumero entero por teclado, por favor.");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int i = 10;
    int cifras = 0;
    int total = 0;
    
    do {
      if ( numeroIntroducido >= 10 ) {
        total = (numeroIntroducido / i);
        i *= 10;
        cifras ++;
      }
      if ( numeroIntroducido <= -10 ) {
        total = (((-1) * numeroIntroducido) / i);
        i *= 10;
        cifras ++;
        } else {
          total = 0;
          cifras = 1;
        }
    } while ( total >= 1 );
    
    System.out.println("El número introducido tiene " + cifras + " cifras." );
  }
}
