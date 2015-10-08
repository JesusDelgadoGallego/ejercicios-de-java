/**
* Sentencia múltiple (switch)
* 
Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
positivo o negativo. Se permiten números de hasta 5 dígitos..
* 
* @author Alfonso Planas Guerrero
*/
public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca un numero entero de hasta 5 cifras, positivo o negativo");
    int x = Math.abs(Integer.parseInt(System.console().readLine()));
    int y = 0;
    if (x>=1000000){
      System.out.println("lo sentimos, solo numeros de hasta 5 cifras ");
    } else { 
      if (x<=9){
      y+= 1;
      }
      if (x<=99){
      y+=1;
      }
      if (x<=999){
      y+=1;
      }
      if (x<=9999){
      y+=1;
      }
      if (x<=99999){
      y+=1;
      }
      System.out.println("Su numero tiene "+y+" cifras");   
    }
  }
}
