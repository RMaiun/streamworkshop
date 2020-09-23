package com.workshop;

import com.workshop.utils.Cat;
import java.util.Arrays;
import java.util.List;

public class Demo2 {

  public static void main(String[] args) {
    List<Cat> cats = Arrays.asList(
        new Cat("Ruslan", Arrays.asList("Rabbit1", "Rabbit2", "Rabbit3", "Rabbit5")),
        new Cat("Artem", Arrays.asList("Rabbit2", "Rabbit3", "Rabbit4", "Rabbit1", "Rabbit5", "Rabbit5")),
        new Cat("Jeka", Arrays.asList("Rabbit4", "Rabbit5", "Rabbit1"))
    );

    String result = findThatRabbit(cats);
    System.out.println(String.join(",", result));

  }

  public static String findThatRabbit(List<Cat> cats) {
    return null;
  }
}
