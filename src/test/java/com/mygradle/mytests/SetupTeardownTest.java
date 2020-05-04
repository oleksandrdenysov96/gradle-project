package com.mygradle.mytests;

import com.mygradle.common.AbstractTest;
import org.testng.annotations.Test;

public class SetupTeardownTest extends AbstractTest {

    //Before Class & AfterClass methods are implemented in base class called "AbstractTest"
    @Test
    public void testTheFirstTask() {
        System.out.println("The first Task with Before Class & AfterClass methods");
    }
}
