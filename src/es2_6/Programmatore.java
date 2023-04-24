package es2_6;

import java.util.ArrayList;

import es2_1.Persona;

public class Programmatore extends Persona {
  private String azienda;
  private ArrayList<String> linguaggi;

  public Programmatore(String nome, String cognome) {
    super(nome, cognome);
    linguaggi = new ArrayList<>();
  }

  public void setAzienda(String azienda) {
    this.azienda = azienda;
  }

  public void addLinguaggio(String linguaggio) {
    linguaggi.add(linguaggio);
  }

  public String getAzienda() {
    return azienda;
  }

  public String getLinguaggi() {
    StringBuffer sb = new StringBuffer();

    for (String linguaggio : linguaggi) {
      sb.append(linguaggio + " ");
    }

    sb.deleteCharAt(sb.length() - 1);

    return sb.toString();
  }

  public static void main(String[] args) {
    Programmatore p1 = new Programmatore("Bjarne", "Stroustrup");
    Programmatore p2 = new Programmatore("Brian", "Kernighan");
    Programmatore p3 = new Programmatore("James", "Gosling");

    p1.addLinguaggio("C");
    p1.addLinguaggio("C++");
    p1.setAzienda("Morgan Stanley");
    p2.addLinguaggio("C");
    p2.addLinguaggio("AWK");
    p3.addLinguaggio("Java");
    p3.addLinguaggio("Oracle");

    System.out.println(p1.getAzienda());

    System.out.println(p2.getLinguaggi());
  }
}
