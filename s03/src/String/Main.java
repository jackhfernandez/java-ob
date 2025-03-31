package String;

public class Main {
  public static void main(String[] args) {
    String cadena = "Mensaje de texto";
/*    int cadenaLen = cadena.length();
    System.out.println("La longitud de mi cadena es " + cadenaLen);

    String cadenaMin = cadena.toLowerCase();
    System.out.println(cadenaMin);

    String cadenaMay = cadena.toUpperCase();
    System.out.println(cadenaMay);

    boolean resultado = cadena.startsWith("Men");
    if (resultado){
      System.out.println("Empieza por lo que estoy buscando");
    } else {
      System.out.println("No empieza por lo estoy buscando");
    }

    boolean resultado2 = cadena.endsWith("to");
    if (resultado2){
      System.out.println("si termina con 'to'");
    } else {
      System.out.println("No termina con 'to'");
    }

    char letra = cadena.charAt(9);
    System.out.println("El caracter es " + letra);

    // Recorrer una cadena
    for (int i=0; i<cadena.length(); i++){
      System.out.println("Caracter actual: " + cadena.charAt(i));
    }

    // Recorrer una cadena inversa
    String reversa = "";
    for (int i=cadena.length() -1 ; i>=0; i--){
      System.out.println("Caracter actual: " + cadena.charAt(i));
    }
*/
    // Recorrer una cadena inversa
    java.lang.String reversa = "";
    for (int i=cadena.length() -1 ; i>=0; i--){
      reversa += cadena.charAt(i);
    }
    System.out.println(cadena);
    System.out.println(reversa);
  }
}
