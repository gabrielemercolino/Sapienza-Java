package es6_1;

import es6_1.successioni.AbstractSuccession;
import es6_1.successioni.Casuale;
import es6_1.successioni.Fibonacci;
import es6_1.successioni.Infinita;
import es6_1.successioni.Quadrata;

public class Main {

  public static void main(String[] args) {
    infinita();
    casuale();
    fibonacci();
    quadrata();
  }

  public static void infinita() {
    System.out.println("Successione Infinita:\n");
    Infinita s = new Infinita();
    consume(s);
    System.out.println();
  }

  public static void casuale() {
    System.out.println("Successione Casuale:\n");
    Casuale s = new Casuale();
    consume(s);
    System.out.println();
  }

  public static void fibonacci() {

    System.out.println("Successione Fibonacci:\n");
    Fibonacci s = new Fibonacci();
    consume(s);
    System.out.println();
  }

  public static void quadrata() {
    System.out.println("Successione Quadrata:\n");
    Quadrata s = new Quadrata();
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
