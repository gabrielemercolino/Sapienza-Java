package slide.generics;

public class LinkedList<T> {
  private Element head;
  private Element tail;

  private class Element {
    T val;
    Element next;

    Element(T val, Element next) {
      this.val = val;
      this.next = next;
    }
  }

  public T getHeadVal() {
    return head.val;
  }

  public LinkedList() {
    tail = head;
  }

  public LinkedList(T val) {
    this();
    addHead(val);
  }

  public void addHead(T val) {
    head = new Element(val, head);
  }

  public void add(T val) {
    Element e = new Element(val, null);
    tail.next = e;
    tail = tail.next;
  }

  public Element popHead() {
    Element x = head;
    head = head.next;
    return x;
  }

  public T getPopHead() {
    Element x = head;
    head = head.next;
    return x.val;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    Element e = head;
    while (e != null) {
      sb.append(e.val);
      if (e.next != null)
        sb.append(" -> ");
      e = e.next;
    }
    return sb.toString();
  }

  public boolean isEmpty() {
    return head == tail;
  }

}
