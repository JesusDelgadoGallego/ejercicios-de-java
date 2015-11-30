/**
*Números aleatorios
*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
*la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
*de suspensos, el número de suficientes, el número de bienes, etc.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico11NotasAlAzar {
  public static void main(String[] args){
    
    System.out.println("Este programa genera 20 notas al azar, las muestra y cuenta cuántas hay de cada tipo, mostrando también el resultado.\n");
    
    int nota;
    String boletin = "";
    int contadorSuspensos = 0;
    int contadorSuficientes = 0;
    int contadorBienes = 0;
    int contadorNotables = 0;
    int contadorSobresalientes = 0;
    
    
    for(int i = 0; i < 20; i++){
      
      nota = (int)(Math.random() * 11);
      
      switch(nota){
        
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
          boletin = "suspenso";
          contadorSuspensos++;
          break;
        case 5:
          boletin = "suficiente";
          contadorSuficientes++;
          break;
        case 6:
          boletin = "bien";
          contadorBienes++;
          break;
        case 7:
        case 8:
          boletin = "notable";
          contadorNotables++;
          break;
        case 9:
        case 10:
          boletin = "sobresaliente";
          contadorSobresalientes++;
          
      }
      
      System.out.print(boletin + ", ");
    }
    
    System.out.println("\n\nNº de Suspensos: " + contadorSuspensos + "\nNúmero de Suficientes: " + contadorSuficientes);
    System.out.println("Nº de Bienes: " + contadorBienes + "\nNº de Notables:" + contadorNotables);
    System.out.println("Nº de Sobresalientes: " + contadorSobresalientes);
  }
}
