package com.lectures.lecture12;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class Main {


    @Test
    public void myFirstTest(){
        assertEquals("", "");
        assertTrue(true);
        assertFalse(true);
        assertNull(null);
    }


    public static void main(String[] args) {

        Car orangeCar = new Car();
        orangeCar.km = 100;
        Car blueCar = new Car();
        blueCar.km = 85;

        System.out.println("Orange car - " + orangeCar.km);
        System.out.println("Blue  car - " + blueCar.km);

        Counter.invokeCounter();
        Counter.invokeCounter();
        Counter.invokeCounter();




        //log.info("Number with static call {}", StaticNumbers.nextValue());
        StaticNumbers obj1 = new StaticNumbers();
        log.info("First object");
        obj1.printArray();
        StaticNumbers obj2 = new StaticNumbers();
        log.info("Second object");
        obj2.printArray();

        MathOperations mathOperations = new MathOperations();
        mathOperations.calculateTriangleFace(2, 2, 60);

        RandomGeneration randomGeneration = new RandomGeneration();
        randomGeneration.toto5From35Generation();
        randomGeneration.randomNumberBetweenRange(10, 50);
        randomGeneration.generateRandomId(14);
        randomGeneration.generateRandomPassword();
    }
}
