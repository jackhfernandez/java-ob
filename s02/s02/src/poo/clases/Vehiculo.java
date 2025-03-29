package poo.clases;

public class Vehiculo {

  // 1. atributos
  String fabricante;
  String modelo;
  double cc;
  int year;
  boolean sport;
  int speed;
  Motor motor;

  // 2. constructores
  public Vehiculo(){

  }

  public Vehiculo(String fabricante, String modelo) {
    this.fabricante = fabricante;
    this.modelo     = modelo;
  }

  public Vehiculo(String fabricante, int year) {
    this.fabricante = fabricante;
    this.year       = year;
  }

  public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
    this.fabricante = fabricante;
    this.modelo     = modelo;
    this.cc         = cc;
    this.year       = year;
    this.sport      = sport;
    this.speed      = speed;
    this.motor      = motor;
  }

  // 3. metodos (comportamiento)
  public void acelerar(int quantity) {
    this.speed += quantity;
  }

  // getter y setters

  // toString

}
