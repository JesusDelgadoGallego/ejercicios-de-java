/**
* Bucles 
* Ejercicio15
* Escribe un programa que dados dos números, uno real (base) y un entero positivo
* (exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
* entre uno y el exponente introducido. 
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico15nElevadoA5 {
  public static void main(String[] args){
    
    System.out.println("Introduce un número real");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce un número entero y positivo");
    int exponente = Integer.parseInt(System.console().readLine());
      
    double potencia = 1;
    if (exponente < 0) {
      do {
        System.out.println("Introduce un número entero y positivo");
        exponente = Integer.parseInt(System.console().readLine());
      } while (exponente < 0 );
    }
    for ( int i = 1; i <= exponente; i++ ) {
        potencia *= base;
        System.out.println( base + " ^" + i + " = " + potencia );
    } 
    
  }
}
