package com.lectures.homeworks.homework7;

public class Homework3 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum1 = 0;
    int sum2 = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        sum1 += arr[i];
      } else {
        sum2 += arr[i];
      }
    }

    System.out.println("Сума четни: " + sum1);
    System.out.println("Сума нечетни: " + sum2);
  }
}
