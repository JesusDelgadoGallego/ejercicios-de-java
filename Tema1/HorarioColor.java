public class HorarioColor {
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";

    System.out.println("\n\n\n\t\tLunes\t\tMartes\t\tMiércoles\t\tJueves\t\tViernes");
    System.out.println("\n\n8:15-11:15\t" + rojo + "PROG\t\t" + rojo + "PROG\t\t" + rojo + "PROG\t\t\t" + verde + "SIM\t\t" + naranja + "BBDD");
    System.out.println(blanco + "\n\t\t\tR\t\tE\t\tCR\t\tE\t\tO\n");
    System.out.println(blanco + "11:45-14:45\t" + azul + "FOL\t\t" + morado + "ED\t\t" + naranja + "BBDD\t\t\t" + blanco + "LM\t\t" + verde + "SIM\n\n\n");
  }
}
