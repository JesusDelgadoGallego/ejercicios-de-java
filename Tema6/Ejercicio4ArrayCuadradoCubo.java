/**
* Arrays 
*Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
*Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
*almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
*deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
*contenido de los tres arrays dispuesto en tres columnas.
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio4ArrayCuadradoCubo {
  public static void main(String[] args){
    
    double[] numero= new double[20];
    double[] cuadrado= new double[20];
    double[] cubo= new double[20];
    
    System.out.println("Este programa genera 20 números aleatorios entre 0 y 100 y muestra su cuadrado y su cubo");
    
    for (int i = 0; i <= 19; i++) {
      
      numero[i] = (Math.random()*100);
      
    }
    
    for (int i = 0; i <= 19; i++) {
      
      cuadrado[i] = Math.pow(numero[i], 2);
      
    }
    
    for (int i = 0; i <= 19; i++) {
      
      cubo[i] = Math.pow(numero[i], 3);
      
    }
    
    for (int i = 0; i <= 19; i++) {
      
      System.out.println((int)numero[i] + "\t" + (int)cuadrado[i] + "\t" + (int)cubo[i]);
      
    }
    
  }
}
