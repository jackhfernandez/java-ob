package com.example;

public class Funciones {
  public static void main(String[] args) {
    // Opcion 1: // funcion sin parametro y sin tipo de retorno
    showMenu();

    // Opcion 2: // funcion sin parametro y con tipo de retorno
    System.out.println(getMenu());

    double price = getPrice();
    System.out.println(price);

    // Opcion 3: // funcion con parametro y sin tipo de retorno
    imprimirSaludo("OpenBootcamp");

    // Opcion 4: // funcion con parametro y con tipo de retorno
    String nombre = "Jack";
    String apellido = "Fernandez";
    String saludo = recibirSaludo(nombre, apellido);
    System.out.println(saludo);

    int resultadoSuma = suma(5,8);
    System.out.println(resultadoSuma);
  }

  static int suma(int a, int b){
    return a+b;
  }

  static String recibirSaludo(String nombre, String apellido){
    return "Buenas tardes " + nombre + " " + apellido;
  }

  static void imprimirSaludo(String nombre){
    System.out.println("Buenas tardes " + nombre);
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
