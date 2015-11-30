/**
* Bucles 
*Escribe un programa que lea un número n e imprima una pirámide de números con n filas
*como en la siguiente figura:
*    1
*   121
*  12321
* 1234321
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico24PiramideNumeros {
  public static void main(String[] args){
    
    System.out.println("El programa pide por pantalla la altura de la pirámide y después la muestra por pantalla.");
    System.out.println("Introduce la altura de la pirámide, por favor. (número entero y positivo.)");
    double altura = Double.parseDouble(System.console().readLine());
    if (((altura) / ((int)(altura)) != 1 ) || ( altura <= 0 )){
      do {
        System.out.println("Dato erróneo. Introduce un número entero  y positivo, por favor.");
        altura = Double.parseDouble(System.console().readLine());
      } while (((altura) / ((int)(altura)) != 1 ) || ( altura <= 0 ));
    }
    double altura2 = altura;
    double contador = 0;
    double contador2 = 1;
    double contador3 = 0;
    int contador4 = 0;
    int j;
    for (int i = 1; i <= altura; i++) {
        //pintamos los espacios por delante
        while ( contador < altura2 ) {
          System.out.print(" ");
          contador++;
        }
        //Pintamos la primera mitad de la fila de la pirámide
        for ( j = 1; j <= contador2; j++) {
          System.out.print(j);
        }
        
        //Pintamos la segunda mitad de la fila de la pirámide
        contador4 = j -2;
        for (int k = 0; k < contador3; k++){
          
          System.out.print(contador4);
          contador4--;
          
        }
        //Pasamos a la siguiente fila de la pirámide
        System.out.println();
        
        
        altura2 -= 1;
        contador = 0;
        contador2++;
        contador3++;
    }
  }
}
