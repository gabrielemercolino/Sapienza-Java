package es8_1;

import java.util.HashSet;

public class Raccolta {
  private HashSet<Canzone> raccolta;

  public Raccolta() {
    raccolta = new HashSet<>();
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("Raccolta:\n");

    for (Canzone c : raccolta) {
      sb.append("\t" + c + "\n");
    }

    return sb.toString();
  }

  public boolean addCanzone(Canzone c) {
    return raccolta.add(c);
  }
}
