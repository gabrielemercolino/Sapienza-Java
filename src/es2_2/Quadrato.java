package es2_2;

public class Quadrato {
  private double lato;

  public Quadrato(double lato) {
    this.lato = lato;
  }

  public double getPerimetro() {
    return lato * 4;
  }

  public static void main(String[] args) {
    Quadrato q = new Quadrato(4);
    System.out.println(q.getPerimetro());
  }
}
