package Vectores;

import java.util.Vector;

public class Main {

  public static void main(String[] args) {

    // Declarando el vector
    Vector<Integer> vector = new Vector();

    // capacidad inicial de 5 elementos, luego incrementa de 15 en 15
    // Vector<Integer> vector1 = new Vector(5, 15);

    // Agregando elementos
    vector.add(1);
    vector.add(2);
    vector.add(3);
    vector.add(4);

    System.out.println("Datos del vector: "+ vector);
/*
    vector.remove(3);
    System.out.println("Datos del vector: "+ vector);
 */

    // Tamano: cantidad de elementos. Capacidad: Tamano asignado puede ser igual o mayor
    System.out.println("Tamanio: " + vector.size() + " y capacidad: " + vector.capacity());

    Vector<Integer> vector2 = new Vector();
    vector2.add(1);
    vector2.add(2);
    vector2.add(3);
    vector2.add(4);

    // Comparar dos vectores
    boolean resultado = vector.equals(vector2);
    System.out.println(resultado);

    // Recorrer un vector. ForEach
    System.out.print("Forma corta: ");
    for (int i : vector) {
      System.out.print(i);
    }

    // For
    System.out.print("\nForma tradicional: ");
    for (int i=0; i<vector.size(); i++) {
      System.out.print( vector.get(i));
    }

    // agregando condicion
    for (int i=0; i<vector.size(); i++) {
      if (i%2==0) {
        vector.remove(i);
        continue;
      }
      System.out.println(vector.get(i));
    }

    System.out.println("Tamanio: " + vector.size() + " y capacidad: " + vector.capacity());

    // Reducir capacidad de un vector, sea igual a la cantidad de elementos
    // Permite ahorrar memoria pero duplicar (crecer o decrecer) un vector es una operacion costosa a nivel computacional
    vector.trimToSize();
    System.out.println("Tamanio: " + vector.size() + " y capacidad: " + vector.capacity());
  }
}
