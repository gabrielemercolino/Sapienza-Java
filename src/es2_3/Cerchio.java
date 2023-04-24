package es2_3;

public class Cerchio {
  private double raggio;

  public Cerchio(double raggio) {
    this.raggio = raggio;
  }

  public double getPerimetro() {
    return 2 * Math.PI * raggio;
  }

  public double getArea() {
    return Math.PI * raggio * raggio;
  }

  public static void main(String[] args) {
    Cerchio c1 = new Cerchio(1);
    Cerchio c2 = new Cerchio(5);
    System.out.println(c1.getPerimetro());
    System.out.println(c2.getArea());
  }
}
