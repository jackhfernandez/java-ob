package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

  public static void main(String[] args) {

    // Capacidad aumenta al 50% en overflow
    ArrayList<String> lista = new ArrayList<String>();
    lista.add("ElementoA");
    lista.add("ElementoB");
    lista.add("ElementoC");
    lista.add("ElementoD");

    System.out.println("\nContenido: " + lista);
    /*
    lista.remove("ElementoB");
    System.out.println("Contenido: " + lista);
     */

    System.out.println("\nRecorriendo con forEach: ");
    for (String nombre : lista ){
      System.out.println(nombre);
    }

    System.out.println("\nRecorriendo for tradicional: ");
    for (int i=0; i<lista.size(); i++) {
      System.out.println(lista.get(i));
    }

    // Convertir un arrayList en array
    String array[] = new String[lista.size()];
    for (int i=0; i<lista.size(); i++) {
      array[i] = lista.get(i);
    }

    // Mostrar array
    System.out.println("\nMostrando array: ");
    for (String nombre : array){
      System.out.println(nombre);
    }

    // Convertir y mostrar array a la vez
    System.out.println("\nConvirtiendo y mostrando array: ");
    for (Object arrayObjeto : lista.toArray()) {
      System.out.println(arrayObjeto.toString());
    }
  }
}
