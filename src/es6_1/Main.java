package es6_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import es6_1.successioni.AbstractSuccession;
import es6_1.successioni.Casuale;
import es6_1.successioni.Fibonacci;
import es6_1.successioni.SuccessioneGenerica;

public class Main {

  public static void main(String[] args) {
    final int MAX_GENERATION = 1000;
    Function<Short, Short> quadrata = (x) -> (short) (x * x);
    Function<Short, Short> infinita = new Function<Short, Short>() {
      @Override
      public Short apply(Short x) {
        int calc = x % 6;
        return switch (calc) {
          case 0 -> 4;
          case 1 -> 8;
          case 2 -> 15;
          case 3 -> 16;
          case 4 -> 23;
          default -> 42;
        };
      }

    };
    Function<Short, Short> casuale = (x) -> (short) (new Random().nextInt());

    List<SuccessioneGenerica> successioni = new ArrayList<>();
    successioni.add(new SuccessioneGenerica(quadrata));
    successioni.add(new SuccessioneGenerica(infinita, MAX_GENERATION));
    successioni.add(new SuccessioneGenerica(casuale, MAX_GENERATION, true));

    for (SuccessioneGenerica s : successioni) {
      consume(s);
    }

    /**
     * With this implementation it's not possible to use the
     * <code>SuccessioneGenerica</code> class
     * as the <code>hasNext</code> method is different
     */
    fibonacci();

  }

  public static void fibonacci() {

    System.out.println("Successione Fibonacci:\n");
    Fibonacci s = new Fibonacci();
    consume(s);
    System.out.println();
  }

  private static <T extends AbstractSuccession> void consume(T s) {
    StringBuffer stampa = new StringBuffer();

    for (short n : s) {
      stampa.append(n + "\n");
    }

    System.out.println(stampa);
  }

}
