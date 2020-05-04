package com.mygradle.mytests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

    @DataProvider(name = "Params Provider")
    public Object[][] getData() {
        return new Object[][] {
                {"First Value" , "Second value"},
                {"First data", "Second data"}
        };
    }

    @Parameters({"username", "password"})
    @Test
    public void testParametersViaXml(String username, String password) {
        System.out.println("Testing the XML param. Username: " + username + " , Password: " + password);
    }

    @Test(dataProvider = "Params Provider")
    public void testParametersViaDataProviders(String firstArg, String secondArg) {
        System.out.println("Testing the data providers Value1: " + firstArg + " , Value2: " + secondArg);
    }
}
