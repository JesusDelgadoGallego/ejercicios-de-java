/**
* Arrays 
*Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
*continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
*programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
*que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
*colocar el número de la posición inicial en la posición final, rotando el resto de números
*para que no se pierda ninguno. Al final se debe mostrar el array resultante.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio12DesplazaAlGusto {
  public static void main(String[] args){
    
    int[] arrayOriginal = new int[10];
    
    int[] arrayAuxiliar = new int[10];
    
    int posicionInicial;
    
    int posicionFinal;
    
    //Pedimos al usuario que introduzca diez números enteros por teclado.
    for (int i = 0; i < 10; i++) {
      
      System.out.println("Introduce número entero, por favor:");
      
      arrayOriginal[i] = Integer.parseInt(System.console().readLine());
      
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
      System.out.printf("│%4d ", arrayOriginal[i]);
    }
    
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    //Nos aseguramos de que el valor introducido por el usuario se corresponde con algún índice del array original.
    System.out.println("Introduce el valor del índice del array original que quieres cambiar de posición");
    
    posicionInicial = Integer.parseInt(System.console().readLine());
    
    if ((posicionInicial < 0) || (posicionInicial > 9)){
      
      do {
        
        System.out.println("El número introducido debe ser igual algún índice del array original.\nIntroduce un valor válido, por favor:");
        
        posicionInicial = Integer.parseInt(System.console().readLine());
        
      } while ( (posicionInicial < 0) || (posicionInicial > 9) );
      
    }
    
    
    System.out.print("Introduce el valor del índice del array original cuyo contenido será ");
    System.out.print("sustituido por el contenido del valor introducido hace un momento.");
    System.out.println(" El número que introduzcas debe ser mayor que el introducido anteriormente." );
    
    posicionFinal = Integer.parseInt(System.console().readLine());
    
    if ( posicionFinal <= posicionInicial ){
      
      do {
        
        System.out.println("El número introducido debe ser mayor que el introducido anteriormente.\nIntroduce un valor válido, por favor:");
        
        posicionFinal = Integer.parseInt(System.console().readLine());
        
      } while ( posicionFinal <= posicionInicial );
      
    }
    //Hacemos una copia del array original para -más tarde- poder rotar los valores sin machacar.
    for (int i = 0; i < 10; i++){
      
      arrayAuxiliar[i] = arrayOriginal[i];
      
    }
    //Introducimos el valor de inicial en el indice final del array auxiliar
    arrayAuxiliar[posicionFinal] = arrayOriginal[posicionInicial];
    
    //Introducimos valores en array auxiliar desde  el índice con valor posicionFinal en adelante hasta la última posición
    for ( int i = posicionFinal + 1; i < 10; i++){
      
      arrayAuxiliar[i] = arrayOriginal[i-1];
      
    }
    
    //La primera posicion del array auxiliar siempre será la última del array original
    arrayAuxiliar[0] = arrayOriginal[9];
    
    //Introducimos los valores del array original rotados una posicion a la derecha en el array
    // auxiliar empezando por la segunda posicion (la primera ya la hemos ocuapdo en el paso anterior)
    //Hasta llegar al indice con valor posicionInicial, pues el resto de valores ya están rotados O SIGUEN SIENDO LOS MISMOS.
    for ( int i = 1; i <= posicionInicial; i++){
      
      arrayAuxiliar[i] = arrayOriginal[i -1];
      
    }
    
    
    // Mostramos el arrayAuxiliar o resultado del intercambio de posiciones y posterior rotacion en una posición hacia la derecha
    System.out.println("\n\nArray Resultado:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", arrayAuxiliar[i]);
    }
    
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    

  }
}
