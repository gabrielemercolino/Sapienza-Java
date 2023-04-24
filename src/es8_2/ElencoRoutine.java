package es8_2;

import java.util.ArrayList;
import java.util.function.Function;

public class ElencoRoutine<T, S> {
  private ArrayList<Function<T, S>> routines;

  public ElencoRoutine() {
    routines = new ArrayList<>();
  }

  public void addRoutine(Function<T, S> routine) {
    routines.add(routine);
  }

  public void execute(T x) {
    for (Function<T, S> routine : routines) {
      try {
        System.out.println(routine.apply(x));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
