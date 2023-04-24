package es8_2;

public class Main {
  public static void main(String[] args) {
    ElencoRoutine<String, Integer> elencoRoutine = new ElencoRoutine<>();
    elencoRoutine.addRoutine(String::length);
    elencoRoutine.addRoutine(Main::countY);
    elencoRoutine.addRoutine(Integer::parseInt);
    elencoRoutine.addRoutine((x) -> {
      char[] chars = x.toCharArray();
      int result = 0;
      for (int i = 0; i < chars.length; i++) {
        result += chars[i];
      }
      return result;
    });

    elencoRoutine.execute("ayutoy");
  }

  public static Integer countY(String x) {
    char[] chars = x.toCharArray();
    int count = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'y')
        count++;
    }
    return count;
  }
}
