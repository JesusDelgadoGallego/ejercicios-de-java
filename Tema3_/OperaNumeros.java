/**
* Tema 3
* Ejercicio 4
* @author Francisco Jesús Delgado Gallego
*/

 public class OperaNumeros {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide que introduzcas dos números por pantalla y a continuación muestra su suma, resta, multiplicación y división.");
      
    System.out.println("Introduce el primer número, por favor");
      
    double primerNumero= Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el segundo número, por favor");
    
    double segundoNumero= Double.parseDouble(System.console().readLine());
    
    double suma = primerNumero + segundoNumero;
    double resta = primerNumero - segundoNumero;
    double multiplicacion = primerNumero * segundoNumero;
    double division = primerNumero / segundoNumero;
    
    System.out.println(" La suma de los dos números es igual a " + suma);
    System.out.println(" La resta de los dos números es igual a " + resta);
    System.out.println(" La multiplicación de los dos números es igual a " + multiplicacion);
    System.out.println(" La división de los dos números es igual a " + division);
    
  }
}
    
    
    
