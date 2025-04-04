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
  }
}
