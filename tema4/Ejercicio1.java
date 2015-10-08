/**
* Sentencia múltiple (switch)
* 
* Escribe un programa que pida por teclado un día de la semana y que 
* diga qué asignatura toca a primera hora ese día.
*
* @author Alfonso Planas Guerrero
*/
public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un dia de la semana de lunes\na viernes del que desea conocer la asigntaura de la primera hora: ");
    String dia = System.console().readLine();
    dia = dia.toLowerCase();
    String nombreDeLaAsignatura;
    switch (dia) {
      case "lunes":
        //sigue abajo
      case "1":
        nombreDeLaAsignatura= "Asignatura lunes";
        break;
      case "martes":
        //sigue abajo
      case "2":
        nombreDeLaAsignatura= "Asignatura martes";
        break;
      case "miercoles":
        //sigue abajo
      case "3":
        nombreDeLaAsignatura= "Asignatura miercoles";
        break;
      case "jueves":
        //sigue abajo
      case "4":
        nombreDeLaAsignatura= "Asignatura jueves";
        break;
      case "viernes":
        //sigue abajo
      case "5":
        nombreDeLaAsignatura= "Asignatura viernes";
        break;

      default:
        nombreDeLaAsignatura= "Dia incorrecto";
    }

    System.out.println(nombreDeLaAsignatura);
  }
}
