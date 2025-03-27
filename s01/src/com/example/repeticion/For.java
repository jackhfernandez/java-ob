package com.example.repeticion;

public class For {
  public static void main(String[] args) {

    for (int i=1; i<3; i++) {
      System.out.println("El valor de i es " + i);
    }

    // Recorrer un array
    String[] nombres = {"Juan", "Franco", "Oscar"};

    for (int i=0; i<nombres.length; i++) {
      System.out.println(nombres[i]);
    }

    int[] numeros = {11, 22, 33};

    int suma = 0;
    for (int i=0; i<numeros.length; i++) {
      suma += numeros[i];
    }
    System.out.println("La suma de elementos es " + suma);

  }
}
