/**
*Números aleatorios
*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
*espacios. Muestra también el máximo, el mínimo y la media de esos números.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico5MAxMinMed {
  public static void main(String[] args){
    
    int aleatorio;
    
    int sumaAleatorios = 0;
    
    int minimo = 200;
    
    int maximo = 0;
    
    System.out.print("Este programa genera 50 números aleatorios entre 100 y 199 (ambos incluidos) y los muestra por pantalla. ");
    System.out.println("A continuación muestra el máximo, el mínimo y la media de dichos números.\n");
    
    for(int i = 0; i < 50; i++ ){
      
      System.out.print( (aleatorio = ((int)(Math.random() * 100) + 100)) + " ");
      
      sumaAleatorios += aleatorio;
      
      if(aleatorio < minimo){
        
        minimo = aleatorio;
        
      }
      
      if(aleatorio > maximo){
        
        maximo = aleatorio;
        
      }
      
    }
    
    System.out.println("\n\nMáximo = " + maximo + "\nMínimo = " + minimo + "\nMedia = " + (sumaAleatorios/50));
    
    
  }
}
