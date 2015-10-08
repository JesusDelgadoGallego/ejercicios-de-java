/**
* Sentencia múltiple (switch)
* Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
* 
* @author Alfonso Planas Guerrero
*/
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca el numero del mes en que nacio");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduzca el numero del dia en que nacio");
    int dia = Integer.parseInt(System.console().readLine());
    //System.out.println(dia + " " + mes + " ");
    if (((mes == 1) && (dia >= 20)) || ((mes == 2) && (dia <= 17))){
      System.out.println("Su signo del zodiaco es Acuario");
    } else if (((mes == 2) && (dia >= 21)) || ((mes == 3) && (dia <= 19))){
      System.out.println("Su signo del zodiaco es Piscis");
      } else if (((mes == 3) && (dia >= 20)) || ((mes == 4) && (dia <= 19))){
      System.out.println("Su signo del zodiaco es Aries");
      } else if (((mes == 4) && (dia >= 20)) || ((mes == 5) && (dia <= 20))){
      System.out.println("Su signo del zodiaco es Tauro");
      } else if (((mes == 5) && (dia >= 21)) || ((mes == 6) && (dia <= 20))){
      System.out.println("Su signo del zodiaco es Geminis");
      } else if (((mes == 6) && (dia >= 21)) || ((mes == 7) && (dia <= 22))){
      System.out.println("Su signo del zodiaco es cancer");
      } else if (((mes == 7) && (dia >= 23)) || ((mes == 8) && (dia <= 22))){
      System.out.println("Su signo del zodiaco es Leo");
      } else if (((mes == 8) && (dia >= 23)) || ((mes == 9) && (dia <= 22))){
      System.out.println("Su signo del zodiaco es Virgo");
      } else if (((mes == 9) && (dia >= 22)) || ((mes == 10) && (dia <=22))){
      System.out.println("Su signo del zodiaco es Libra");
      } else if (((mes == 10) && (dia >= 23)) || ((mes == 11) && (dia <= 21))){
      System.out.println("Su signo del zodiaco es Escorpio");
      } else if ((((mes == 1) && (dia >= 1)) || ((mes == 1) && (dia <= 19)) ||((mes == 12) && (dia >= 22)) || ((mes == 12) && (dia <= 31)))){
      System.out.println("Su signo del zodiaco es Capricornio");
    } else {
      System.out.println("fecha incorrecta");
    }    
  }
}
