/**
* Sentencia múltiple (switch)
* Escribe un programa en que dado un número del 1 a 7 escriba el 
* correspondiente nombre del día de la semana.
* @author Alfonso Planas Guerrero
*/
public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca el numero del dia de la semana");
    int dia= Integer.parseInt(System.console().readLine());
    String diaSemana;
    switch (dia) {
      case 1:
        diaSemana= "Lunes";
        break;
      case 2:
        diaSemana= "Martes";
        break;
      case 3:
        diaSemana= "Miercoles";
        break;
      case 4:
        diaSemana= "Jueves";
        break;
      case 5:
        diaSemana= "Viernes";
        break;
      case 6:
        diaSemana= "Sabado";
        break;
      case 7:
        diaSemana= "Domingo";
        break;
      
      default:
        diaSemana= "Numero incorrecto";
    }
    System.out.println(diaSemana);

  }
}
