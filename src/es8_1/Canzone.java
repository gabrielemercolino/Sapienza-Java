package es8_1;

import java.util.Objects;

public class Canzone implements Comparable<Canzone> {
  private String titolo;
  private String autore;

  public Canzone(String titolo, String autore) {
    this.titolo = titolo;
    this.autore = autore;
  }

  public String getAutore() {
    return autore;
  }

  public String getTitolo() {
    return titolo;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null)
      return false;

    if (!(o instanceof Canzone))
      return false;

    Canzone c = (Canzone) o;

    return Objects.equals(titolo, c.titolo) && Objects.equals(autore, c.autore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titolo, autore);
  }

  @Override
  public String toString() {
    return "\"" + titolo + "\", di " + autore;
  }

  @Override
  public int compareTo(Canzone c) {
    int result = titolo.compareTo(c.titolo);
    if (result == 0)
      result = autore.compareTo(c.autore);
    return result;
  }
}
