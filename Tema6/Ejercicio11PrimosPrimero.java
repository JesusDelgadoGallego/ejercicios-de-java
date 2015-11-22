/**
* Arrays 
*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
*A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
*para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
*desplazando el resto de números (los que no son primos) de tal forma que no se pierda
*ninguno. Al final se debe mostrar el array resultante.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio11PrimosPrimero {
  public static void main(String[] args){
    
    int[] array1 = new int[10];
    
    int[] arrayPrimos = new int[10];
    
    int[] arrayNoPrimos = new int[10];
    
    int[] arrayResultado = new int[10];
    
    boolean primo = true;
    
    int contadorNoPrimos = 9;
    
    int contadorPrimos = 0;
    
    //Inicializamos todas las posiciones de los arrays auxiliares con un 
    //número negativo para poder discriminar, más adelante, los valores introducidos por nosotros 
    // de los valores por defecto.
    for (int i = 0; i < 10; i++){
      
      arrayPrimos[i] = -1;
      
    }
    
    
    for (int i = 0; i < 10; i++){
      
      arrayNoPrimos[i] = -1;
      
    }
    
    //Inicializamos el array original con valores que el usuario introduce por teclado.
    //Nos aseguramos de que estos valores son positivos para que no afecte a la posterior discriminación
    // entre valores por defecto y valores introducidos por el usuario en los arrays auxiliares.
    
    for (int i = 0; i < 10; i++) {
      
      System.out.println("Introduce número entero y positivo, por favor:");
      
      int valorValido = Integer.parseInt(System.console().readLine());
      
      if (valorValido >= 0 ){
        
        array1[i] = valorValido;
        
      } else {
        
        System.out.println ("El valor introducido no es correcto");
        i--;
        
      }
      
    }
    //Leemos uno por uno los valores del array original. En cada posición, si se trata de un valor 
    //primo lo introducimos en el array auxioliar de numeros primos desde la primera posición hacia adelante.
    //Si se trata de numeros no primos los introducimos en el array auxiliar de numeros no primos desde la última 
    //posición hacia atrás.
    //En este ejercicio consideramos que el número "1" no es primo.
    
    
    for (int i = 0; i < 10; i++){
      
      for (int o = array1[i] -1; o > 1; o--){
        
        if ( array1[i] % o == 0 ) {
          
          primo = false;
          
        } 
        
        if ( array1[i] % o != 0 ){
          
          primo = true;

        }
        
      }

      if ( array1[i] == 1 ){
        
        primo = false;
        
      }
      
      if ( array1[i] == 2 ) {
        
        primo = true;
        
      }
        
      if (primo == true){
          
          arrayPrimos[contadorPrimos] = array1[i];
          
          contadorPrimos++;
          
      } else {
          
          arrayNoPrimos[contadorNoPrimos] = array1[i];
          
          contadorNoPrimos--;
          
      }
      
    }
    //Introducimos los valores de los arrays auxiliares en el array resultado: los valores primos
    //son introducidos desde la primera posición hacia adelante y los valores no primos son introducidos
    //desde la última posición hacia atrás.
    for (int i = 0; i < 10; i++){
      
      if (arrayPrimos[i] >= 0){
        arrayResultado[i] = arrayPrimos[i];
      }
      
    }
    
    for (int i = 9; i >= 0; i--){
      
      if (arrayNoPrimos[i] >= 0){
        
        arrayResultado[i] = arrayNoPrimos[i];
        
      }
      
    }
    
    // Muestra el array original
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", array1[i]);
    }
    
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    
    // Mostramos arrayResultado.
    System.out.println("\n\nArray con los primos al principio:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", arrayResultado[i]);
    }
    
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
  }
}
  
