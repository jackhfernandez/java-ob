package com.example;

public class Funciones {
  public static void main(String[] args) {
    // Opcion 1: // funcion sin parametro y sin tipo de retorno
    showMenu();

    // Opcion 2: // funcion sin parametro y con tipo de retorno
    System.out.println(getMenu());

    double price = getPrice();
    System.out.println(price);
  }

  static double getPrice() {
    return 100.99;
  }

  static void showMenu(){
    System.out.println("1. Shutdown computer");
    System.out.println("2. Restart computer");
    System.out.println("3. Log off");
    System.out.println("4. Manual shutdown settings");
    System.out.println("5. Abort shutdown");
    System.out.println("6. Exit\n");
  }

  static String getMenu(){
    return "Bienvenidos al menu: \n1. Shutdown com...";
  }
}
