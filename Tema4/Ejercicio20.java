/**
* Sentencia múltiple (switch)
* 
* Realiza un programa que diga si un número entero positivo introducido por teclado es
* capicúa. Se permiten números de hasta 5 cifras..
* 
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Bienvenidos al localizador de numeros capicuas (solo numeros entre 2 y 5 cifras)");
    int x = Integer.parseInt(System.console().readLine());
    if ((x>=1000000)||(x<10)){
      System.out.println("lo sentimos, solo numeros de entre 2 y 5 cifras ");
    } else if ((x<=99)&&((x/10)==(x%10))) {
      System.out.println("su numero es capicua");
    } else if ((x<=999)&&((x / 100) == ( x % 10))){
      System.out.println("su numero es capicua");
    } else if ((x<=9999)&&(((x / 1000) == (x % 10)) && ((( x / 100 ) % 10)== (( x / 10) % 10)))){
      System.out.println("su numero es capicua");
    } else if ((x<=99999)&&(((x / 10000) == (x % 10) ) && ((((x / 1000) % 10)) == ((x / 10) % 10)))){
      System.out.println("su numero es capicua");
    } else {
      System.out.println("su numero no es capicua");
    }   
  }
}
