/**
*Números aleatorios
*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
*partidos y el pleno al quince (15 filas).
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico7Quiniela {
  public static void main(String[] args){
  
    System.out.println("Este programa muestra tres apuestas de la quieniela en tres columnas y el pleno al quince:\n");

    int resultado;


    for(int i = 1; i < 15 ; i++){
      
      System.out.printf("Partido nº %2d |", i);
      
      for(int j = 0; j < 3; j++){
        
        resultado = ((int)(Math.random() * 3) + 1);
      
        if (resultado == 2){
        
          System.out.print(" X |");
        } else {
        
          System.out.print(" " + resultado + " |");
        
        }
      
      }
      
      System.out.println();

    }
    
    
    int plenoAlQuince = ((int)(Math.random() * 3) + 1);
    
    if (plenoAlQuince == 2){
        
          System.out.print("\nPleno al 15 ||| X |||");
        } else {
        
          System.out.print("\nPleno al 15 ||| " + plenoAlQuince + " |||");
        
        }

  
  }
} 
