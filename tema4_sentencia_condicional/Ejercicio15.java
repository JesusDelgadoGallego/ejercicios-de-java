/**
* Ejercicio4
*Escribe un programa que pinte una pirámide rellena con un carácter 
* introducido por teclado que podrá ser una letra, un número o un 
* símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario 
* mediante un menú elegir si el vértice de la pirámide está apuntando
* hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
* @author Francisco Jeśus Delgado Gallego
*/
public class Ejercicio15 {
  public static void main(String[] args) {
    String linea;
    System.out.println("Bienvenido al programa de construccion de piramides.");
    System.out.println("Por favor, introduzca el simbolo, numero o caracter que del\nque quiere que la piramide este formada");
    String x =System.console().readLine();
    System.out.println("Por favor, introduzca la direccion que desea que la piramide apunte\n(arriba, abajo, izquierda, derecha");
    String p =System.console().readLine();
    if (p.equals("arriba")) {
      System.out.println("\n\n  "+x+"\n "+x+x+x+"\n"+x+x+x+x+x);
    } else if (p.equals("abajo")){
      System.out.println("\n\n"+x+x+x+x+x+"\n "+x+x+x+"\n  "+x);
    } else if (p.equals("izquierda")){
      System.out.println("\n\n  "+x+"\n "+x+x+"\n"+x+x+x+"\n "+x+x+"\n  "+x);
    } else if (p.equals("derecha")){
      System.out.println("\n\n"+x+"\n"+x+x+"\n"+x+x+x+"\n"+x+x+"\n"+x);
    }
    
  }
}
