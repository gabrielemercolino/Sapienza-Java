package slide.generics;

public class Pila<T> {
  private LinkedList<T> pila;

  public Pila(int size) {
    pila = new LinkedList<>();
  }

  public void push(T el) {
    pila.add(el);
  }

  public T pop() {
    return pila.getPopHead();
  }

  public T peek() {
    return pila.getHeadVal();
  }

  public boolean isEmpty() {
    return pila.isEmpty();
  }
}
