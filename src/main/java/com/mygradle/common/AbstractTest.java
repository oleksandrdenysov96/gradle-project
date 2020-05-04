package com.mygradle.common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AbstractTest {

    @BeforeClass
    public void beforeClassDescription() {
        System.out.println("This one is called in BeforeClass. Method Name - " + Thread.currentThread()
                .getStackTrace()[1].getMethodName());
    }

    @AfterClass
    public void afterClassDescription() {
        System.out.println("This one is called in AfterClass. Method name - " + Thread.currentThread()
                .getStackTrace()[1].getMethodName());
    }
}
