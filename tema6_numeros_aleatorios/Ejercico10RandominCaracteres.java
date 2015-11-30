/**
*Números aleatorios
*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
*con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
*., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico10RandominCaracteres {
  public static void main(String[] args){
    
    System.out.print("Este programa pinta por pantalla diez líneas formadas por caracteres. ");
    System.out.print("El carácter con el que se pinta cada línea se elige de");
    System.out.print(" forma aleatoria entre uno de los siguientes: *, -, =,., |, @.");
    System.out.println("Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.\n\n");
    
    int linea;
    int longitudLinea;
    String caracter = "";
    
    for(int j = 0; j < 10; j++){
          
      linea = ((int)(Math.random() * 6) + 1);
      
      switch(linea){
        
        case 1:
          caracter = "*";
          break;
        case 2:
          caracter = "=";
          break;
        case 3:
          caracter = "-";
          break;
        case 4:
          caracter = ".";
          break;
        case 5:
          caracter = "|";
          break;
        case 6:
          caracter = "@";
          break;
      
      }
      
      longitudLinea = ((int)(Math.random() * 40) + 1);
      
      for (int i = 0; i < longitudLinea; i++){
        
        System.out.print(caracter);
        
      }
      
      System.out.println();
      
    }
  
  }
}
