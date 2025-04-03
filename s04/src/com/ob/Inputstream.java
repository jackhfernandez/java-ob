package com.ob;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Inputstream {
  public static void main(String[] args) {

    try {
      InputStream fichero = new FileInputStream("C:\\Users\\jackh\\Documents\\elite-class-unprg\\algebra\\ordinario");
    } catch (FileNotFoundException e) {
      System.out.println("Oye, que el programa de error: " + e.getLocalizedMessage());
    }
  }
}
