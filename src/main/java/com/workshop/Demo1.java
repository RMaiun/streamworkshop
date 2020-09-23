package com.workshop;

import com.workshop.utils.Cat;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

  public static void main(String[] args) {
    List<Cat> cats = Arrays.asList(
        new Cat("Ruslan", Arrays.asList("Rabbit1", "Rabbit2")),
        new Cat("Artem", Arrays.asList("Rabbit2", "Rabbit3")),
        new Cat("Jeka", Arrays.asList("Rabbit4", "Rabbit5", "Rabbit1"))
    );

    String killedRabbits = getAllKilledRabbits(cats);
    System.out.println(killedRabbits);

  }

  public static String getAllKilledRabbits(List<Cat> cats) {
    return null;
  }
}
