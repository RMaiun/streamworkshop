package com.workshop.utils;

import java.util.List;
import java.util.function.Function;

public class Tuple2 {

  private List<Integer> values;
  private Function<Integer, String> fa;

  public Tuple2(List<Integer> values, Function<Integer, String> fa) {
    this.values = values;
    this.fa = fa;
  }

  public List<Integer> getValues() {
    return values;
  }


  public Function<Integer, String> getFa() {
    return fa;
  }
}
