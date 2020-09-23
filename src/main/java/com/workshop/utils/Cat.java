package com.workshop.utils;

import java.util.List;

public class Cat {

  private String name;
  private List<String> killedRabbits;

  public Cat(String name, List<String> killedRabbits) {
    this.name = name;
    this.killedRabbits = killedRabbits;
  }

  public String getName() {
    return name;
  }

  public List<String> getKilledRabbits() {
    return killedRabbits;
  }

}
