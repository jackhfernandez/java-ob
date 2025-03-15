package com.example.repeticion;

public class While {
  public static void main(String[] args) {
    int contador = 0;

    while (contador < 10) {
      String nombre = "Prueba";
      contador++;
      if (contador == 5) {
        // break;
        continue;
      }
      System.out.println("Valor de contador " + contador);
    }
    // variable nombre esta fuera del ambito
    // System.out.println(nombre);
  }
}
