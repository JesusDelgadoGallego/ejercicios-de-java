/**
 * 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las 
 * asignaturas que se imparten en el curso. Cada pregunta acertada
 * sumará un punto. El programa mostrará al final la calificación 
 * obtenida. Pásale el minicuestionario a tus compañeros y pídeles que 
 * lo hagan para ver qué tal andan de conocimientos en las diferentes 
 * asignaturas del curso.
 * 
* @author Francisco Jesús Delgado Gallego
*/
public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al Test, por favor eliga la respuesta correcta de cada una de las preguntas \n\n");
    System.out.println("Pregunta n1");
    System.out.println("a | Respuesta correcta");
    System.out.println("b | Respuesta incorrecta");
    System.out.println("c | Respuesta incorrecta");
    System.out.println("d | Respuesta incorrecta");
    String pregunta1 = System.console().readLine();
    System.out.println("\nPregunta n2");
    System.out.println("a | Respuesta incorrecta");
    System.out.println("b | Respuesta correcta");
    System.out.println("c | Respuesta incorrecta");
    System.out.println("d | Respuesta incorrecta");
    String pregunta2 = System.console().readLine();
    System.out.println("\nPregunta n3");
    System.out.println("a | Respuesta incorrecta");
    System.out.println("b | Respuesta incorrecta");
    System.out.println("c | Respuesta correcta");
    System.out.println("d | Respuesta incorrecta");
    String pregunta3 = System.console().readLine();
    System.out.println("\nPregunta n4");
    System.out.println("a | Respuesta incorrecta");
    System.out.println("b | Respuesta incorrecta");
    System.out.println("c | Respuesta incorrecta");
    System.out.println("d | Respuesta correcta");
    String pregunta4 = System.console().readLine();
    System.out.println("\nPregunta n5");
    System.out.println("a | Respuesta incorrecta");
    System.out.println("b | Respuesta incorrecta");
    System.out.println("c | Respuesta incorrecta");
    System.out.println("d | Respuesta correcta");
    String pregunta5 = System.console().readLine();
    System.out.println("\nPregunta n6");
    System.out.println("a | Respuesta incorrecta");
    System.out.println("b | Respuesta incorrecta");
    System.out.println("c | Respuesta correcta");
    System.out.println("d | Respuesta incorrecta");
    String pregunta6 = System.console().readLine();
    System.out.println("\nPregunta n7");
    System.out.println("a | Respuesta incorrecta");
    System.out.println("b | Respuesta correcta");
    System.out.println("c | Respuesta incorrecta");
    System.out.println("d | Respuesta incorrecta");
    String pregunta7 = System.console().readLine();
    System.out.println("\nPregunta n8");
    System.out.println("a | Respuesta correcta");
    System.out.println("b | Respuesta incorrecta");
    System.out.println("c | Respuesta incorrecta");
    System.out.println("d | Respuesta incorrecta");
    String pregunta8 = System.console().readLine();
    int p1=0;
    int p2=0;
    int p3=0;
    int p4=0;
    int p5=0;
    int p6=0;
    int p7=0;
    int p8=0;
    if (pregunta1.equals("a")){
      p1 = 1;
    } if (pregunta2.equals("b")) {
      p2= 1;
    } 
    if (pregunta3.equals("c")) {
      p3= 1;
    } 
    if (pregunta4.equals("d")) {
      p4= 1;
    } 
    if (pregunta5.equals("d")) {
      p5= 1;
    } 
    if (pregunta6.equals("c")) {
      p6= 1;
    } 
    if (pregunta7.equals("b")) {
      p7= 1;
    } 
    if (pregunta8.equals("a")) {
      p8= 1;
    }
  System.out.println("Su puntuancion es de " + (p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8));      
  }
}
