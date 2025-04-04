package com.ob;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerJava {
  public static void main(String[] args) {

    boolean ok = false;
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese dos numeros: ");

      try {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ok = true;
      } catch (InputMismatchException e) {
        System.out.println("Numeros invalidos");
      }
    } while (!ok);
  }
}