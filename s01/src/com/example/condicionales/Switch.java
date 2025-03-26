package com.example.condicionales;

public class Switch {
  public static void main(String[] args) {

    String dia = "ahhgas;";

    switch (dia) {
      case "Lunes":
        System.out.println("Es lunes");
        break;
      case "Martes":
        System.out.println("Es martes");
        break;
      case "Miercoles":
        System.out.println("Es miercoles");
        break;
      case "Jueves":
        System.out.println("Es jueves");
        break;
      case "Viernes":
        System.out.println("Es viernes");
        break;
      case "Sabado":
        System.out.println("Es sabado");
        break;
      case "Domingo":
        System.out.println("Es domingo");
        break;
      default:
        System.out.println("Opcion invalida");
        break;
    }
  }
}
