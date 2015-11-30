/**
* Bucles 
* Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
* teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico19Piramide {
  public static void main(String[] args){
    
    System.out.print("Este programa pinta una pirámide por pantalla tras ");
    System.out.println("introducir por teclado la altura y el caracter con el que se desea pintar la misma.");
    System.out.println("Introduce la altura de la pirámide, por favor. (número entero y positivo.)");
    double altura = Double.parseDouble(System.console().readLine());
    if (((altura) / ((int)(altura)) != 1 ) || ( altura <= 0 )){
      do {
        System.out.println("Dato erróneo. Introduce un número entero  y positivo, por favor.");
        altura = Double.parseDouble(System.console().readLine());
      } while ( (altura) / ((int)(altura)) != 1 );
    }
    System.out.println("Introduce el caracter con el que quieres pintar tu pirámide, por favor.)");
    String caracter = System.console().readLine();
    
    double contador = 1;
    int aux = 1;
    double alturaParcial = altura;
    for (double filas = 1; filas <= altura; filas++ ) {
      while(contador <= alturaParcial){
        System.out.print(" ");
        contador++;
      }
      for (int i = 1; i <= aux; i++){
        System.out.print(caracter);
      }
      System.out.print("\n");
      alturaParcial--;
      aux += 2;
      contador = 1;
    }
  }
}
