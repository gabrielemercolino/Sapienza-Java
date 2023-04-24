package es2_1;

public class Persona {
  private String nome;
  private String cognome;

  public Persona(String nome, String cognome) {
    this.nome = nome;
    this.cognome = cognome;
  }

  public void stampa() {
    System.out.println("Nome: " + nome + ", cognome: " + cognome);
  }

  public static void main(String[] args) {
    Persona p = new Persona("Gabriele", "Mercolino");
    p.stampa();
  }
}