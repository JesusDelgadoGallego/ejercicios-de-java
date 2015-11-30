/**
* Bucles 
* Realiza un programa que pinte una pirámide hueca por pantalla. La altura se debe pedir por
* teclado. El carácter con el que se pinta ña silueta de la pirámide también se debe pedir por teclado.
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico20PiramideHueca {
  public static void main(String[] args){
    
    System.out.print("Este programa pinta una pirámide por pantalla tras ");
    System.out.println("introducir por teclado la altura y el caracter con el que se desea pintar la misma.");
    System.out.println("Introduce la altura de la pirámide, por favor. (número entero y positivo.)");
    double altura = Double.parseDouble(System.console().readLine());
    if (((altura) / ((int)(altura)) != 1 ) || ( altura <= 0 )){
      do {
        System.out.println("Dato erróneo. Introduce un número entero  y positivo, por favor.");
        altura = Double.parseDouble(System.console().readLine());
      } while (((altura) / ((int)(altura)) != 1 ) || ( altura <= 0 ));
    }
    System.out.println("Introduce el caracter con el que quieres pintar tu pirámide, por favor.)");
    String caracter = System.console().readLine();
    
    double contador = 1;
    int aux = 1;
    double alturaParcial = altura;
    while(contador <= (alturaParcial + 1) ){
        System.out.print(" ");                  //Pintamos los espacios en blanco de la fila del vértice de la pirámide.
        contador++;
    }
    System.out.println(caracter);               //Pintamos el vértice de la pirámide y un salto de linea
    contador = 1;
    
    for (double filas = 1; filas < ( altura - 1 ); filas++ ) {    // altura -1 porque el vértice ya está pintado
      while(contador <= alturaParcial){                 //Pintamos los espacios en blanco de fuera de la piramide
        System.out.print(" ");
        contador++;
      }
      
      System.out.print(caracter);  //Pintamos el primer caracter
      
      for (int i = 1; i <= aux; i++){   //Pintamos los espacios en blanco de dentro de la pirámide
        System.out.print(" ");
      }
      
      System.out.println(caracter);   //Pintamos el segundo caracter y un salto de linea
      
      alturaParcial--;
      aux += 2;
      contador = 1;
    }
    System.out.print("  ");                       //Pintamos la base de la pirámide.
    for (int i = 1; i < (2 * altura); i++){
      
      System.out.print(caracter);
    }
  }
}
