/**
* Tema 3
* Ejercicio 1
* @author Francisco Jesús Delgado Gallego
*/

 public class Multiplica2Numeros {
  public static void main(String[] args) {
    
    System.out.println("Este programa te pedirá que introduzcas dos números por teclado. Después te mostrará el resultado de su multiplicación.");
    
    System.out.println("Introduce un número y pulsa intro, por favor.");
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce otro número y pulsa intro, por favor.");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    
    double producto= primerNumero * segundoNumero;
    
    System.out.printf("El producto de los dos números que has introducido es %.2f", producto);
    

    
  }
}
