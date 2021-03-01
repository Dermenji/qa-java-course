package com.lectures.homeworks.homework7;

import java.util.Scanner;

public class Homework5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % (3 * 7) != 0)
        System.out.println(i);
    }
  }
}
