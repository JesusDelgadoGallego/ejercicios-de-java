/**
* Sentencia múltiple (switch)
* 
* Escribe un programa que diga cuál es la primera cifra de un número 
* entero introducido por teclado. Se permiten números de hasta 5 cifras.
* 
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca un numero entero de hasta 5 cifras");
    int x = Integer.parseInt(System.console().readLine());
    if (x>=1000000){
      System.out.println("lo sentimos, solo numeros de hasta 5 cifras ");
    } else if (x<=9){
      System.out.println("la primera cifra de su numero es " +x);
    } else if (x<=99){
      System.out.println("la primera cifra de su numero es " +( x/10));
    } else if (x<=999){
      System.out.println("la primera cifra de su numero es " +( x/100));
    } else if (x<=9999){
      System.out.println("la primera cifra de su numero es " +( x/1000));
    } else if (x<=99999){
      System.out.println("la primera cifra de su numero es " + (x/10000) );
    }   
  }
}
