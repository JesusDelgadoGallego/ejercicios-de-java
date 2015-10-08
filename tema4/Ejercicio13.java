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
    
    if ((n1>=n2) && (n1>=n3)) {
      System.out.print(n1);
    } else if ((n2>=n1) && (n2>=n3)){
      System.out.print(n2);
    } else if ((n3>=n1) && (n3>=n2)){
      System.out.print(n3);
    }
    if (((n2>=n1) && (n3<=n1)) || ((n3>=n1) && (n2<=n1))) {
      System.out.print(">" + n1);
    } else if (((n1>=n2) && (n3<=n2)) || ((n3>=n2) && (n1<=n2))){
      System.out.print(">" + n2);
    } else if (((n2>=n3) && (n1<=n3)) || ((n2>=n3) && (n1<=n3))){
      System.out.print(">" + n3);
    }    
    if ((n1<=n2) && (n1<=n3)) {
      System.out.print(">" + n1);
    } else if ((n2<=n1) && (n2<=n3)){
      System.out.print(">" + n2);
    } else if ((n3<=n1) && (n3<=n2)){
      System.out.print(">" + n3);
    }
  }
}
