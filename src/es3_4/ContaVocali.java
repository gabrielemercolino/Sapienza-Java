package es3_4;

public class ContaVocali {
  private static String[] vocali = { "a", "e", "i", "o", "u" };

  public static void stampaContaVocali(String a) {
    int contaA = 0;
    int contaE = 0;
    int contaI = 0;
    int contaO = 0;
    int contaU = 0;

    for (int i = 0; i < a.length(); i++) {
      for (String vocale : vocali) {
        if (a.substring(i, i + 1).equals(vocale)) {
          switch (vocale) {
            case "a" -> contaA++;
            case "e" -> contaE++;
            case "i" -> contaI++;
            case "o" -> contaO++;
            case "u" -> contaU++;
          }
          break;
        }
      }
    }

    System.out.println("a=" + contaA + " e=" + contaE + " i=" + contaI + " o=" + contaO + " u=" + contaU);
  }

  public static void main(String[] args) {
    stampaContaVocali("ciao");
  }
}
