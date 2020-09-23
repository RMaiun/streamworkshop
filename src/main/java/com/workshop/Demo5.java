package com.workshop;

import java.util.concurrent.ThreadLocalRandom;

public class Demo5 {

  public static void main(String[] args) {

    int result = getSecondMaxValue(10);
    System.out.println(String.format("result= %d", result));
  }

  public static int getSecondMaxValue(int limit) {
    // put your code here
    return 0;
  }

  private static int random() {
    return ThreadLocalRandom.current().nextInt(0, 100);
  }

  private static String increaseTwice(int x) {
    return String.valueOf(x * 2);
  }
}
