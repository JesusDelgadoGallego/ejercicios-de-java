/**
*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
*intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
*ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
*estás pensando es mayor o menor que el que te acaba de decir.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico14PiensaNumero {
  public static void main(String[] args){
    
    System.out.println("Piensa un número entre el 0 y el 100. Intentaré adivinarlo en 5 intentos o menos.");
    
    int maximo = 101;
    int minimo = 0;
    int numero;
    
    
    for(int intentos = 5; intentos > 0; intentos --){
      
      numero = ((int)(Math.random() * (maximo - minimo) + minimo));
      
      System.out.println("¿Es el  " + numero + " el número que has pensado?. Responde S/N:");
      
      String respuesta = System.console().readLine();
      
      if (respuesta.equalsIgnoreCase("S")){
        
        System.out.println("Lo sabía!!");
        System.exit(0);
        
      } 
      
      if (!(respuesta.equalsIgnoreCase("S")) && (intentos != 1)){
        
        System.out.println("Agh! Me quedan " + (intentos - 1) + " intentos.");
        System.out.println("Es " + numero + " mayor o menor que el número que has pensado. Contesta +/-");
        
        String respuesta2 = System.console().readLine();
        
        if(respuesta2.equals("+")){
          maximo = numero;
        } else {
          
          minimo = numero;
        }
        
        
      }
      
      if (!(respuesta.equalsIgnoreCase("S")) && (intentos == 1)){
        
        
          System.out.println("Me has vencido");
        
      }
    
    }
    
  }
}
