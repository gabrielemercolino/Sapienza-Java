package es6_1.successioni;

import java.util.Iterator;
import java.util.function.Function;

public class SuccessioneGenerica extends AbstractSuccession {

  private Function<Short, Short> function;
  private Integer GEN_LIMIT;
  private boolean onlyMaxGeneration;

  public SuccessioneGenerica(Function<Short, Short> function, Integer gEN_LIMIT, boolean onlyMaxGeneration) {
    this.function = function;
    GEN_LIMIT = gEN_LIMIT;
    this.onlyMaxGeneration = onlyMaxGeneration;
  }

  public SuccessioneGenerica(Function<Short, Short> function, Integer GEN_LIMIT) {
    this(function, GEN_LIMIT, false);
  }

  public SuccessioneGenerica(Function<Short, Short> function) {
    this(function, null);
  }

  @Override
  public Iterator<Short> iterator() {
    return new Iterator<Short>() {

      short x = 0;
      Integer CURR_GEN = 0;

      @Override
      public boolean hasNext() {
        if (GEN_LIMIT == null)
          return function.apply(x) >= 0;
        else if (onlyMaxGeneration)
          return ++CURR_GEN < GEN_LIMIT;
        else
          return function.apply(x) >= 0 && ++CURR_GEN < GEN_LIMIT;
      }

      @Override
      public Short next() {
        return function.apply(x++);
      }

    };
  }

}
