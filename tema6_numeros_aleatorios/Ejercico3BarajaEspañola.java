/**
*Números aleatorios
*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
*2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico3BarajaEspañola {
  public static void main(String[] args){
  
    int numero = (int)( Math.random() * 10 + 1 );
    
    int palo = (int)( Math.random() * 4);
  
    String valorNumero = "";
    
    String valorPalo = "";
    
    
    switch(numero) {
      
      case(1):
        valorNumero = "As";
        break;
      
      case(8):
        valorNumero = "Sota";
        break;
        
      case(9):
        valorNumero = "Caballo";
        break;
        
      case(10):
        valorNumero = "Rey";
        break;
        
      default:
        valorNumero = String.valueOf(numero);
        break;
      
    }
    
    
    switch(palo) {
      
      case(0):
        valorPalo = "Oros";
        break;
      
      case(1):
        valorPalo = "Copas";
        break;
        
      case(2):
        valorPalo = "Espadas";
        break;
        
      case(3):
        valorPalo = "Bastos";
        break;
        
    }
    
    System.out.println("Este programa genera una carta de la baraja española al azar: " + valorNumero + " de " + valorPalo);

  }
}




