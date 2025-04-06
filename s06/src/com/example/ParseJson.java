package com.example;

import java.io.InputStream;
import java.io.FileInputStream;

import org.json.*;

public class ParseJson {
  public static void main(String[] args) {

    try {
      // Creamos el inputStream desde un fichero
      InputStream is = new FileInputStream("C:/Users/jackh/dev/java_ob/s06/src/datos.json");

      // Creamos un tokenizador que leera desde nuestro IS
      JSONTokener tokener = new JSONTokener(is);

      // Y se la pasamos a una instancia de la clase JSONObject
      JSONObject obj = new JSONObject(tokener);

      // sacamos las credenciales
      JSONObject credenciales = obj.getJSONObject("credenciales");

      String usuario = credenciales.getString("usuario");
      String clave = credenciales.getString("clave");

      System.out.println("Usuario: " + usuario + " | Clave: " + clave);

      // Dentro de credenciales tenemos los videos
      JSONArray videos = credenciales.getJSONArray("videos");
      for (Object video : videos) {
        System.out.println(video.toString());
      }
    } catch (Exception e) {
      System.out.println("No se pudo leer el fichero : " + e.getMessage());
    }
  }
}
