/**
*Números aleatorios
*Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
*probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2
* 3/6 y 1/3 = 2/6.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico8QuinielaTrucada {
  public static void main(String[] args){
  
    System.out.println("Este programa muestra tres apuestas de la quieniela en tres columnas y el pleno al quince:\n");

    int resultado;
    
    
    for(int i = 1; i < 16 ; i++){
      
      if(i != 15){
        
        System.out.printf("Partido nº %2d |", i);
      
      
        for(int j = 0; j < 3; j++){
          
          resultado = ((int)(Math.random() * 6) + 1);
          
          switch(resultado){
            
            case 1:
            case 2:
            case 3:
              System.out.print(" 1 |");
              break;
            case 4:
            case 5:
              System.out.print(" X |");
              break;
            case 6:
              System.out.print(" 2 |");
              break;
          
          }
          
        }
      } else {
        
        System.out.print("\nPleno al 15 |||");
        
        resultado = ((int)(Math.random() * 6) + 1);
          
          switch(resultado){
            
            case 1:
            case 2:
            case 3:
              System.out.print(" 1 |||");
              break;
            case 4:
            case 5:
              System.out.print(" X |||");
              break;
            case 6:
              System.out.print(" 2 |||");
              break;
          }
        
      }
      
      System.out.println();
      
    }
    
  
  }
}
