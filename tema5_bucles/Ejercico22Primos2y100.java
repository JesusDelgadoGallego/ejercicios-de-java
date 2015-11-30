/**
* Bucles 
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico22Primos2y100 {
  public static void main(String[] args){
    
    System.out.println("Impresión por pantalla de los números primos entre 2  100, ambos incluidos");
    
    System.out.println("2");
    
    for (int i = 3; i < 100; i++){
      boolean primo = true;
      for (int j = 2; j < i; j++) {
            
              if ( (i % j) == 0) {
                primo = false;
              }
      }
      if (primo){
        System.out.println(i);
      }
        
    }
  }
}
