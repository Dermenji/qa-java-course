package com.lectures.homeworks.homework7;

public class Fibo {
  public static void main(String[] args) {
    int[] fibo = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

    int sum = 0;
    for (int i = 0; i < fibo.length; i++) {
      sum += fibo[i];
    }

    System.out.println(sum);
  }
}
