package es8_1;

import java.util.TreeSet;

public class RaccoltaOrdinata {
  private TreeSet<Canzone> raccolta;

  public RaccoltaOrdinata() {
    raccolta = new TreeSet<>();
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
