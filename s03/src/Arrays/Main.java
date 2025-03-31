package Arrays;

public class Main {
  public static void main(String[] args) {
/*
    // array de enteros
    int arrayUno[] = {1, 2, 3, 4, 5 };

    for (int i : arrayUno) {
      System.out.println(i + " ");
    }

    // array de strings
    String nombres[] = {
        "Juan",
        "Pepito",
        "Francis"
    };
    for (String nombre : nombres) {
      System.out.println(nombre);
    }

    // Longitud
    System.out.println("Longitud array 'nombres' " + nombres.length);
*/
    // Array bidimensional
    int arrayBidi[][] = {
        {1, 2, 3, 4},
        {10, 20, 30, 40}
    };

    for (int i = 0; i < arrayBidi.length; i++) {
      for (int j = 0; j < arrayBidi[i].length; j++) {
        System.out.println(arrayBidi[i][j]);
      }
    }
  }
}
