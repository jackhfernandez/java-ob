package com.example.condicionales;

public class IfElseIf {
  public static void main(String[] args) {

    String dia = "uhkn";

    // Ejemplos de comparar
    boolean resultadoNume = 5 == 5;
    boolean resultado = dia.equals("Martes");

    // if else if
    if (dia.equals("Lunes")) {
      System.out.println("Animo con la semana champions");

    } else if (dia.equals("Martes")) {
      System.out.println("Martes con M de Me besas");

    } else if (dia.equals("Miercoles")) {
      System.out.println("A la m todo");

    } else if (dia.equals("Jueves")) {
      System.out.println("Ya es juergues");

    } else if (dia.equals("Viernes")) {
      System.out.println("Nos fuimos");

    } else if (dia.equals("Sabado")) {
      System.out.println("Nos morimos");

    } else if (dia.equals("Domingo")) {
      System.out.println("Depresion");
    } else {
      System.out.println("No es un dia valido!");
    }
  }
}
