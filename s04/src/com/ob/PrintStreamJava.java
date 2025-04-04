package com.ob;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamJava {
  public static void main(String[] args) {

    // Printstream
    try {
      // Escribir un archivo
      PrintStream info = new PrintStream("copia.txt");
      info.println("Hola");

      // Cerrar flujo
      info.close();

    } catch (FileNotFoundException e) {
      System.out.println("No se pudo crear o abrir el archivo: " + e.getMessage());
    }

    // Forma mas limpia y segura
    // try-with-resources asegura que el PrintStream se cierre automáticamente
    try (PrintStream info = new PrintStream("copia.txt")) {
      info.println("Hola");
    } catch (FileNotFoundException e) {
      System.out.println("Error: No se pudo crear o escribir en el archivo.");
      e.printStackTrace();
    }
  }
}
