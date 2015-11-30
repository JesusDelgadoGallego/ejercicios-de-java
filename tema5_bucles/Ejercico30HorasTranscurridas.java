/**
*Bucles
*Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de
*la semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se
*puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se
*debe comprobar que el usuario introduce los datos correctamente y que el segundo día es
*posterior al primero.
*
* 
* 
* @author Jesús Delgado Gallego
*/



public class Ejercico30HorasTranscurridas {
  public static void main(String[] args){
  //Pedimos el primer día de la semana
  System.out.println("Introduce un día de la semana, por favor:");
  System.out.println("1)Lunes \t 2)Martes \t 3)Miércoles \t 4)Jueves \t 5)Viernes \t 6)Sábado \t 7)Domingo:");
  int dia1 = Integer.parseInt(System.console().readLine());
  
  if ( (dia1 <= 0) || (dia1 > 7) ) {
    
    do{
      
      System.out.println("El dato introducido no es correcto. Introduce un número valido,por favor:");
      dia1 = Integer.parseInt(System.console().readLine());
      
    }while ( (dia1 <= 0) || (dia1 > 7) );
    
  }
  
  //Pedimos la hora del primer día de la semana
  System.out.println("Introduce una hora del día, por favor: (números entre 1 y 24)");
  int hora1 = Integer.parseInt(System.console().readLine());
  
  if ( (hora1 <= 0) || (hora1 >24) ){
    
    do{
      
      System.out.println("El dato introducido no es correcto. Introduce un número valido,por favor:");
      hora1 = Integer.parseInt(System.console().readLine());
      
    }while ( (hora1 <= 0) || (hora1 >24) );

  }
  
  //Asignamos una cadena de caracteres al valor numérico del día 1 para poder traducirlo más adelante
  String dia1EnLetras = "";
  
  switch(dia1){
    
    case(1):
      dia1EnLetras = "lunes";
      break;
    case(2):
      dia1EnLetras = "martes";
      break;
    case(3):
      dia1EnLetras = "miércoles";
      break;
    case(4):
      dia1EnLetras = "jueves";
      break;
    case(5):
      dia1EnLetras = "viernes";
      break;
    case(6):
      dia1EnLetras = "sábado";
      break;
    case(7):
      dia1EnLetras = "domingo";
      break;
      
  }
  
  
  //Pedimos el segundo día de la semana. Debe ser mayor que el primero
  System.out.println("Introduce un día de la semana mayor que el primero, por favor:");
  System.out.println("1)Lunes \t 2)Martes \t 3)Miércoles \t 4)Jueves \t 5)Viernes \t 6)Sábado \t 7)Domingo:");
  int dia2 = Integer.parseInt(System.console().readLine());
  
  if ( (dia2 <= 0) || (dia2 > 7) || (dia2 < dia1) ) {
    
    do{
      
      System.out.println("El dato introducido no es correcto. Introduce un número valido,por favor:");
      dia2 = Integer.parseInt(System.console().readLine());
      
    }while ( (dia1 <= 0) || (dia1 > 7) || (dia2 < dia1) );
    
  }
  
  //Pedimos la hora del segundo día de la semana.
  System.out.println("Introduce otra hora del día, por favor:(números entre 1 y 24)");
  int hora2 = Integer.parseInt(System.console().readLine());
  
  if ( (hora2 <= 0) || (hora2 >24) ){
    
    do{
      
      System.out.println("El dato introducido no es correcto. Introduce un número valido,por favor:");
      hora2 = Integer.parseInt(System.console().readLine());
      
    }while ( (hora2 <= 0) || (hora2 >24) );

  }
  
  
  //Asignamos una cadena de caracteres al valor numérico del día 2 para poder traducirlo más adelante
  String dia2EnLetras = "";
  
  switch(dia2){
    
    case(1):
      dia2EnLetras = "lunes";
      break;
    case(2):
      dia2EnLetras = "martes";
      break;
    case(3):
      dia2EnLetras = "miércoles";
      break;
    case(4):
      dia2EnLetras = "jueves";
      break;
    case(5):
      dia2EnLetras = "viernes";
      break;
    case(6):
      dia2EnLetras = "sábado";
      break;
    case(7):
      dia2EnLetras = "domingo";
      break;
      
  }
  
  //Sumamos las horas que hay entre los dos días
  int cuentaHoras = 0;
  for ( int i = dia1; i <= dia2; i++){
    
    if (i == dia1){
      
      cuentaHoras += (24 - hora1);
      
    }
    
    if (i == dia2){
      
      cuentaHoras += hora2;
      
    }
      
    if ((i != dia1) && (i != dia2)){
      
      cuentaHoras += 24;
      
    }
    
  }
  
  System.out.println("Entre el " + dia1EnLetras + " a las " + hora1 + ":00h y el " + dia2EnLetras + " a las " + hora2 + ":00h hay " + cuentaHoras + " horas.");
  
  }
}
