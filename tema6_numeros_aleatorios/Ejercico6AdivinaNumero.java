/**
*Números aleatorios
*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
*y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
*oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico6AdivinaNumero {
  public static void main(String[] args){
  
  int solucion = (int)(Math.random() * 101);
  
  
  System.out.println("He pensado un número entre 0 y 100.Tienes 5 intentos para adivinarlo.");
  
  for(int intentos = 5; intentos > 0; intentos--){
    
    System.out.println("Número de intentos restantes: " + intentos + ".\nIntroduce un número y pulsa intro, por favor:\n");
    
    int prediccion = Integer.parseInt(System.console().readLine());
    
    if (prediccion == solucion){
      
      System.out.println("HAS ACERTADO!!!");
      intentos = 0;
    
    }
    
    if ((prediccion < solucion) && (intentos != 1)){
      
      System.out.println("Si estuviera en tu pellejo probaría con un número mayor");
      
    }
    
    if ((prediccion > solucion) && (intentos != 1)){
      
      System.out.println("Si estuviera en tu pellejo probaría con un número menor");
      
    }
    
    if (intentos == 1){
      
      System.out.println("GAME OVER");
      
    }
    

  }
  
  System.out.println( "El número que buscabas era el " + solucion);
  
  
  
  
  }
}


