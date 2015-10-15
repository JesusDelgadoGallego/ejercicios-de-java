public class DimeSiEsPar {
  public static void main(String[] args) {
    String respuesta;
    do {
      System.out.println("Introduce un número entero, por favor:");
      int numero = Integer.parseInt(System.console().readLine());
      if (numero %2 == 0) {
        System.out.println("El número introducido es par.");
      } else {
        System.out.println("El número introducido es impar.");
      }
      System.out.println("¿Quieres seguir introduciendo números? Responde `s` o `n`:");
      respuesta = System.console().readLine();
    } while (respuesta.equalsIgnoreCase("s") == true );
  
  }
}
