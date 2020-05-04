package com.mygradle.mytests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTests {

    @BeforeGroups("Smoke")
    public void setUpBeforeGroups() {
        System.out.println("This one is called before \"Smoke\" group.");
    }

    @AfterGroups("Smoke")
    public void setUpAfterGroups() {
        System.out.println("This one is called after \"Smoke\" group.");
    }

    @Test (groups = {"Smoke"})
    public void test1() {
        System.out.println("Test Case #1. \"Smoke\" group.");
    }

    // This one is excluded!
    @Test (groups = {"Regression"})
    public void test2() {
        System.out.println("Test Case #2.");
    }

    @Test (groups = {"Sanity"}, dependsOnGroups = {"Smoke"})
    public void test3() {
        System.out.println("Test Case #3. \"Sanity\" group, dependsOnGroups = {\"Smoke\"}");
    }
}
