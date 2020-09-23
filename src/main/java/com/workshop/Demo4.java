package com.workshop;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

  public static void main(String[] args) {
    List<Integer> data = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10);

  }

  private static String pushedToRabbit(int data) {
    return String.format("%d pushed to RabbitMQ", data);
  }

  private static String storeIntoDb(int data) {
    return String.format("%d stored into DniproDB", data);
  }
}
