package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    HashMap<String, Integer> mapa = new HashMap<>();
    // Agregar contenido al mapa
    mapa.put("clave1", 10);
    mapa.put("clave2", 20);
    mapa.put("clave3", 30);
    mapa.put("clave5", 50);
    mapa.put("clave6", 60);
    mapa.put("clave7", 70);
    mapa.put("clave8", 80);

    // Reemplazar un valor existente
    mapa.replace("clave4", 50);

    // Eliminar clave
    mapa.remove("clave2");

    System.out.println(mapa);               // Mostrar mapa
    System.out.println(mapa.get("clave1")); // Mostrar valor de la clave

    // Recorrer un mapa
    for (Map.Entry elemento : mapa.entrySet()) {
      System.out.println("Clave: " + elemento.getKey());
      System.out.println("Valor: " + elemento.getValue());
    }
  }
}
