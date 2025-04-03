package GestionErrores;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese dos numeros: ");

    int numA = scanner.nextInt();
    int numB = scanner.nextInt();

    try {
      int resultado = numA / numB;
      System.out.println("Resultado es: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Boom!!!, excepcion es: " + e.getClass());
    } catch (Exception e) {
      System.out.println("Estoy en una excepcion que no es aritmetica");
    } finally {
      System.out.println("Finally");
    }
  }
}
