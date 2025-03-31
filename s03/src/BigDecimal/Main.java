package BigDecimal;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    // Utilizar en datos financieros o alta precision

    BigDecimal valorA = new BigDecimal(3.14);
    BigDecimal valorB = new BigDecimal(3.15);

    // sumar BigDecimal
    BigDecimal resultado = valorA.add(valorB);
    System.out.println(resultado.toString());
  }
}
