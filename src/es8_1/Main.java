package es8_1;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    RaccoltaOrdinata raccolta = new RaccoltaOrdinata();
    for (int i = 0; i < 100; i++) {
      raccolta.addCanzone(new Canzone("c" + new Random().nextInt(i + 1), "Me"));
    }
    System.out.println(raccolta);
  }
}
