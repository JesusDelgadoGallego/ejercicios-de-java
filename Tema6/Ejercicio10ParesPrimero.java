/**
* Arrays 
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio10ParesPrimero {
  public static void main(String[] args){
  
    int[] array1 = new int[20];
    
    int[] arrayPares = new int[20];
    
    int[] arrayImpares = new int[20];
    
    int[] arrayResultado = new int[20];
    
    int contadorPar = 0;
    
    int contadorImpar = 19;
    
    //Iniacializamos todos los valores de las arrays por defecto con el valor "-1", para poder diferenciar los valores generados 
    // aleatoriamente de las posiciones no ocupadas. 
    for (int i = 0; i < 20; i++){
      
      arrayPares[i] = -1;
      
    }
    
    
    for (int i = 0; i < 20; i++){
      
      arrayImpares[i] = -1;
      
    }
    
    
    // Array de 20 posiciones con números aleatorios entre 0 y 100
    for (int i = 0; i < 20; i++ ){
      
      array1[i] = (int)(Math.random()*100);
      
    }
    
    // Separamos los valores pares de los impares mediante dos arrays auxiliares.
    for (int i = 0; i < 20; i++ ){
      
      if ( array1[i] %2 == 0) {
        
        arrayPares[contadorPar] = array1[i];
        
        contadorPar ++;
        
      } 
    }
      
    //  En el array auxiliar de impares introduciremos los valores desde la última posición
    // hacia atrás. Esto es debido a que cuando queramos unir las dos arrays auxiliares en una, obteniendo el resultado, introduciremos los
    //valores impares desde atrás hacia adelante.
    
    for (int i = 19; i >= 0; i--){
      
      if (array1[i] %2 != 0) {
        
        arrayImpares[contadorImpar] = array1[i];
        
        contadorImpar--;
        
      }
      
      
    }
    
    
    //Introducimos los valores del array auxiliar que contiene los valores pares en el array resultado. Empezamos por la primera posición 
    // ya que queremos que los números pares estén al principio. Es importante discriminar entre valores positivos y negativos para diferenciar los valores
    // introducidos por nosotros de los valores previos. Por esto le dimos un valor negativo a todos los valores.
    for (int i = 0; i < 20 ; i++){
      
      if (arrayPares[i] >= 0){
        
        arrayResultado[i] = arrayPares[i];
        
      }
      
    }
    
    //Ahora hacemos lo propio con los números impares, pero esta vez introducimos los números de atrás hacia adelante. Como el total de posiciones 
    //de la array resultado debe ser 20 no debemos preocuparnos de que los valores impares machaquen a los pares.
    
    for (int i = 19; i >= 0; i--){
      
      if (arrayImpares[i] >= 0){
        
        arrayResultado[i] = arrayImpares[i];
        
      }
 
    }
    
    System.out.println("Array de 20 números aleatorios entre 0 y 100");
    
    for (int n: array1){
      
      System.out.print( n + " | ");
    }
    
    System.out.println("\n \n");
    
    /*
    for (int n: arrayPares){
      
      System.out.print(n + " | ");
    }
    
    System.out.println("\n \n");
    
    for (int n: arrayImpares){
      
      System.out.println(n + " | ");
    }
    
    System.out.println("\n \n");  */
    
    System.out.println("Array anterior con los valores pares al principio y los valores imapres al final");
    
    for (int n: arrayResultado){
      
      System.out.print(n + " | ");
    }

    
    
  
  
  }
}
