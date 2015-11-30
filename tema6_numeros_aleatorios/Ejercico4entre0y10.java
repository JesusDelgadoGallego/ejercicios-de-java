/**
*Números aleatorios
*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
*2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico4entre0y10 {
  public static void main(String[] args){
  
    System.out.println("Este programa muestra 20 números aleatorios entre 0 y 10 (ambos incluídos) separados por espacios:");
    
    for(int i = 0; i < 20; i++){
      
      System.out.print((int)( Math.random() * 11 ) + " ");
      
    }
  
  }
}
