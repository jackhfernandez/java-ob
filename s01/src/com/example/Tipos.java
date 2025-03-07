package com.example;

public class Tipos {
  public static void main(String[] args) {

    // 1. Numericos
    // 1.1 enteros
    byte  var1 = 5;   // 1 byte  | -128 - 127
    short var2 = 10;  // 2 bytes | -32768 - 32767
    int   var3 = 20;  // 4 bytes | -2mm - 2mm
    long  var4 = 100; // 8 bytes | -9 0*16...

    // 1.2 decimales
    float  var5 = 5.5f;
    double var6 = 19.7d;

    // 2. booleano
    boolean var7 = false;
    boolean var8 = true;

    // 3. texto
    char var9 = 'a';
    String var10 = "Lorem ipsum n....";

    System.out.println("byte   : "+ var1);
    System.out.println("short  : "+ var2);
    System.out.println("int    : "+ var3);
    System.out.println("long   : "+ var4);
    System.out.println("float  : "+ var5);
    System.out.println("double : "+ var6);
    System.out.println("boolean: "+ var7);
    System.out.println("boolean: "+ var8);
    System.out.println("char   : "+ var9);
    System.out.println("String : "+ var10);


  }
}
