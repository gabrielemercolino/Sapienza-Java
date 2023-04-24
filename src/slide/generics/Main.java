package slide.generics;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
      Random numRandom = new Random();
      linkedList.addHead(numRandom.nextInt(0, 10));
    }
    System.out.println(linkedList);
  }
}
