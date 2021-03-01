package com.lectures.homeworks.homework7;

public class Homework2 {
  public static void main(String[] args) {
    float[] arr = {2.0f, 3.0f, 4.0f};

    float sum = 0f;
    float avg;

    for (float element : arr) {
      sum += element;
    }

    avg = sum / arr.length;

    System.out.println(avg);
  }
}
