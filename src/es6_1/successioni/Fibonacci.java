package es6_1.successioni;

import java.util.Iterator;

public class Fibonacci extends AbstractSuccession {

  private class Iteratore implements Iterator<Short> {

    private short a = 0;
    private short b = 1;

    @Override
    public boolean hasNext() {
      return (short) (a + b) > 0;
    }

    @Override
    public Short next() {
      short temp = b;
      b = (short) (a + b);
      a = temp;
      return b;
    }

  }

  @Override
  public Iterator<Short> iterator() {
    return new Iteratore();
  }

}
