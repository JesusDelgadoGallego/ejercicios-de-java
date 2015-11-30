/**
*Números aleatorios
*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
*ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
*carácter.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico12MAtrix {
  public static void main(String[] args){
    
    char caracter = ' ';
    
    
    for (int i = 0; i < 4000; i++){
      
      caracter = (char)((int)(Math.random() * 95) + 32);
      System.out.print(caracter);
      
    }
  
  }
}
