/**
* Sentencia múltiple (switch)
* 
* Escribe un programa que ordene tres números enteros introducidos por teclado.
* 
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Vamos a ordenar tres numeros de mayor a menor");
    System.out.println("Introduzca primer numero:");
    int n1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca segundo numero:");
    int n2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca tercer numero:");
    int n3 = Integer.parseInt(System.console().readLine());
    
    int aux = n1;
    
    if ( n1 < n2) {
      n1 = n2;
      n2 = aux;
    }
    if (n2 < n3 ) {
      aux = n2;
      n2 = n3;
      n3 = aux;
    }
    if ( n1 < n2) {
      aux = n1;
      n1 = n2;
      n2 = aux;
    }
    System.out.println(n1 + " es mayor que " + n2 + ", que a su vez es mayor que " + n3 + " .");
  }
}
