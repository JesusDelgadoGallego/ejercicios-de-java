/**
* Arrays 
*Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
*determinado año y que muestre a continuación un diagrama de barras horizontales con
*esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
*carácter. ("\u25A1")
* 
* 
* @author Jesús Delgado Gallego
*/

public class Ejercicio8temperaturaMedia {
  public static void main(String[] args){
  
    String[] meses = new String[12];
    
    meses[0] = "Enero";
    meses[1] = "Febrero";
    meses[2] = "Marzo";
    meses[3] = "Abril";
    meses[4] = "Mayo";
    meses[5] = "Junio";
    meses[6] = "Julio";
    meses[7] = "Agosto";
    meses[8] = "Septiembre";
    meses[9] = "Octubre";
    meses[10] = "Noviembre";
    meses[11] = "Diciembre";
    
    int[] temperaturaMedia = new int[12];
    
    for (int i = 0; i <= 11; i ++ ){
      
      System.out.println("Introduzca la temperatura media de " + meses[i] + ", por favor:");
      temperaturaMedia[i] = Integer.parseInt(System.console().readLine());
      
    }
    
    System.out.println();
    System.out.println("TEMPERATURAS MEDIAS: \n");
    
    for (int i = 0; i < 12; i++){
      
      int n = 0;
      
      System.out.println( meses[i] + " : " + temperaturaMedia[i] + " C ");
       
      do {
        System.out.print("\u25A1");
        n++;
        
      } while (n < temperaturaMedia[i]);
      
      
      System.out.println();
      
      
      n = 0;
      
    }

  }
}
