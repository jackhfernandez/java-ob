package poo.clases;

public class Main {

  public static void main(String[] args) {

    // Clase identificador = new Clas();

    // crear un objeto utilizando el constructor vacio
    Vehiculo toyotaPrius = new Vehiculo();

    Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

    // crear un objeto utilizando el constructor con parametros
    Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
    System.out.println(fordMondeo.fabricante);
    System.out.println(fordMondeo.year);
    System.out.println(fordMondeo.speed);
    fordMondeo.acelerar(50);
    System.out.println(fordMondeo.speed);

  }
}
