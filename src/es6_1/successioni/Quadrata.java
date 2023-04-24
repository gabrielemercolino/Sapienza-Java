package es6_1.successioni;

import java.util.Iterator;

public class Quadrata extends AbstractSuccession {

  private class Iteratore implements Iterator<Short> {

    private short indice;

    @Override
    public boolean hasNext() {
      return (short) (indice * indice) >= 0;
    }

    @Override
    public Short next() {
      short res = (short) (indice * indice);
      indice++;
      return res;
    }

  }

  @Override
  public Iterator<Short> iterator() {
    return new Iteratore();
  }

}
