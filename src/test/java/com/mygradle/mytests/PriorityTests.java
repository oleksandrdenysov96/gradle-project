package com.mygradle.mytests;

import org.testng.annotations.Test;

public class PriorityTests {

    @Test (priority = 3)
    public void testA() {
        System.out.println("A test is passed.");
    }

    @Test (priority = 2)
    public void testB() {
        System.out.println("B test is passed.");
    }

    @Test (priority = 1)
    public void testC() {
        System.out.println("C test is passed.");
    }
}
