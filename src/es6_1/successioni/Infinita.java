package es6_1.successioni;

import java.util.Iterator;

public class Infinita extends AbstractSuccession {

  @Override
  public Iterator<Short> iterator() {
    return new Iterator<Short>() {

      final int GEN_LIMIT = 1000;
      int currentGeneration;

      @Override
      public boolean hasNext() {
        return currentGeneration < GEN_LIMIT;
      }

      @Override
      public Short next() {
        currentGeneration++;
        int calc = (currentGeneration + 1) % 6;
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
  }

}
