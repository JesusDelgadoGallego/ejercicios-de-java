/**
* Bucles 
* Ejercicio7
*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
*El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
*mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
*ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
*
*
* @author Jesús Delgado Gallego
*/



public class Ejercicio7CajaFuerte {
  public static void main(String[] args){
    String clave ="1234";
    System.out.println("Introduce la contraseña de la caja fuerte. Es un número de 4 cifras. Tienes 4 intentos.\nContrasena:");
    for ( int intentos = 1; intentos <= 4; intentos++ ) {
      String usuario = System.console().readLine();
      if ( clave.equals(usuario) ) {
        System.out.println("Contraseña correcta!");
        intentos = 4;
      } else {
          System.out.println("Contraseña incorrecta. Número de intentos restantes: " + (4 - intentos) );
      }
    }
  }
}
