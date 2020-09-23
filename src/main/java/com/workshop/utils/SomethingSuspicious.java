package com.workshop.utils;

import java.util.Comparator;
import java.util.stream.Collector;

public class SomethingSuspicious {

  private int count;
  private Comparator<Pair> comparator = Comparator.comparing(p -> p.getKey());
  private Pair min;
  private Pair max;

  public int count() {
    return count;
  }

  public Pair min() {
    return min;
  }

  public Pair max() {
    return max;
  }

  void accept(Pair val) {
    if (count == 0) {
      min = max = val;
    } else if (comparator.compare(val, min) < 0) {
      min = val;
    } else if (comparator.compare(val, max) > 0) {
      max = val;
    }
    count++;
  }

  SomethingSuspicious combine(SomethingSuspicious that) {
    if (this.count == 0) {
      return that;
    }
    if (that.count == 0) {
      return this;
    }

    this.count += that.count;
    if (comparator.compare(that.min, this.min) < 0) {
      this.min = that.min;
    }
    if (comparator.compare(that.max, this.max) > 0) {
      this.max = that.max;
    }
    return this;
  }

  public static Collector<Pair, SomethingSuspicious, SomethingSuspicious> collector() {
    return Collector.of(
        SomethingSuspicious::new,
        SomethingSuspicious::accept,
        SomethingSuspicious::combine,
        Collector.Characteristics.UNORDERED, Collector.Characteristics.IDENTITY_FINISH
    );
  }

}
