package com.example.repeticion;

public class ForEach {
  public static void main(String[] args) {

    String[] nombres = {"Juan", "Franco", "Oscar"};

    for (String nombre: nombres) {
      System.out.println(nombre);
    }

    int[] numeros = {11, 22, 33};

    int suma = 0;
    for (int numero: numeros) {
      suma += numero;
    }
    System.out.println("La suma es " + suma);
  }
}
