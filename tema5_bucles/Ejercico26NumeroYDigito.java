/**
*Bucles
*Realiza un programa que pida primero un número y a continuación un dígito. El programa
*nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese
*dígito en el número introducido.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico26NumeroYDigito {
  public static void main(String[] args){
  
    System.out.println("Introduce un número entero, por favor:");
    //numero introducido por teclado en forma de STRING
    String numeroString = System.console().readLine();
    
    //cantidad de dígitos que tiene el número introducido
    int numeroCifras = numeroString.length();
    
    
    //El número introducido en forma de INTEGER
    int numeroInt = Integer.parseInt(numeroString);
    
    //Pedimos por teclado el dígito del que queremos saber la posición
    System.out.println("Introduce un dígito del número introducido anteriormente: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    //damos la vuelta al número para poder indicar qué posición ocupa el dígito de derecha a izquierda
    int numeroDelReves = 0;
    while (numeroInt > 0){
      
      numeroDelReves = (numeroDelReves * 10) + (numeroInt % 10);
      numeroInt /= 10;
      
    }
    
    //El número introducido anteriormente está dado la vuelta, por lo que si determinamos qué posición ocupa de derecha a izquierda en dicho número
    // obtendremos qué posición ocupa de izquierda a derecha en el número original.
    //Para ello, con este bucle for, vamos comprobando cifra por cifra, en cada iteración si dicha cifra se corresponde con el dígito introducido por el usuario
    //Cuando la cifra coincida con el dígito, el número de iteración (i) nos dará la posición de dicho número en el número original DE DERECHA A IZUIERDA.
    System.out.println("El número " + digito + "aparece dentro del número " + numeroString + " en las posiciones: ");
    
    for (int i = 1; i <= (numeroCifras + 1 ); i++){
      
      int ultimaCifra = numeroDelReves % 10;
      
      
      if (ultimaCifra == digito){
        
        System.out.println(i);
        
      }
        
      numeroDelReves /= 10;
    }
    

  }
}
