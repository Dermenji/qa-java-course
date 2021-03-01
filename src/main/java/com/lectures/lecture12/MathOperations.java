package com.lectures.lecture12;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MathOperations {

    public void calculateTriangleFace(double a, double b, int angle) {
        double triangleFace = 0.5 * a * b * Math.sin(Math.toRadians(angle));
        log.info("Triangle face is:" + triangleFace);
    }

    public static void max(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        log.info("Max value is: " + max);
    }

    public static void minMax(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        log.info("Max value is: " + max + ", Min value is: " + min);
    }

    public static void powSqrt() {
        double originalNum = 5;
        double result1 = Math.pow(originalNum, 2);
        double result2 = Math.sqrt(result1);

        log.info("Pow: " + result1);
        log.info("Sqrt: " + result2);
        System.out.println(originalNum == result2);
    }
}
