package es2_7;

public class RegistratoreDiCassa {
  private double totale;

  public double paga(double importo) throws Exception {
    if (importo >= totale)
      return importo - totale;
    throw new Exception("Not enough");
  }

}
