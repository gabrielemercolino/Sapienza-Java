package es6_1.successioni;

import java.util.Iterator;
import java.util.Random;

public class Casuale extends AbstractSuccession {

  private class Iteratore implements Iterator<Short> {

    private final int GEN_LIMIT = 1000;
    private int currentGeneration;

    @Override
    public boolean hasNext() {
      return currentGeneration++ <= GEN_LIMIT;
    }

    @Override
    public Short next() {
      return (short) new Random().nextInt();
    }

  }

  @Override
  public Iterator<Short> iterator() {
    return new Iteratore();
  }

}
