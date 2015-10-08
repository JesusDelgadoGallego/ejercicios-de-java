 /**
 * Sentencia múltiple (switch)
 * Realiza un programa que resuelva una ecuación de segundo grado
 * (del tipo ax 2 + bx + c =0).
 * X= (-b+-Math.sqrt(b*b-4ac))/2a
 * @author Alfonso Planas Guerrero
 */
public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al programa de calculo de ecuaciones ax2 + bx + c = 0");
    System.out.println("Por favor, introduzca el valor a");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduzca el valor b");
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduzca el valor c");
    double c = Double.parseDouble(System.console().readLine());
    double x1 = ((0-b)- (Math.sqrt(b * b -(4 *a *c)))) / (2 * a);
    double x2 = ((0-b)+ (Math.sqrt(b * b -(4 *a *c)))) / (2 * a);
    if (a==0) {
      System.out.println("El valor de X es " + ( (0 - c) / b));
    } else if ((b * b) < ( 4 * a * c )) {
      System.out.println("Esta ecuacion no tiene solucion");
    } else if ((Math.sqrt(b * b -(4 *a *c)) == 0)) {
      System.out.println("El valor de x es " + ((0 - b ) / (2 * a)));  
    } else {
      System.out.printf("X corresponde a los valores de %.2f o de %.2f", x1, x2 );
    }    
  }
}
