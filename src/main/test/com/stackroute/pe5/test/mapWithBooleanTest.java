package com.stackroute.pe5.test;

import com.stackroute.pe5.mapWithBoolean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class mapWithBooleanTest {
    mapWithBoolean objectOfMap = new mapWithBoolean();

    @Before
    public void setUp() throws Exception {
        mapWithBoolean objectOfMap = new mapWithBoolean();
    }


    @After
    public void tearDown() throws Exception {
        objectOfMap = null;
    }

    @Test

    public void testSuccessMapCreation() {
        Map<String, Boolean> ActualValue = new HashMap<String, Boolean>();
        ActualValue = objectOfMap.numberOfCounts("the enter the string and sort");
        Map<String, Boolean> ExpectedValue = new HashMap<String, Boolean>();
        ExpectedValue.put("the", true);
        ExpectedValue.put("enter", false);
        ExpectedValue.put("string", false);
        ExpectedValue.put("and", false);
        ExpectedValue.put("sort", false);

        assertEquals(ExpectedValue, ActualValue);
    }


    public void FailureMapCreation() {
        Map<String, Boolean> ActualValue = new HashMap<String, Boolean>();
        ActualValue = objectOfMap.numberOfCounts("the enter the string and sort");
        Map<String, Boolean> ExpectedValue = new HashMap<String, Boolean>();
        ExpectedValue.put("the", true);
        ExpectedValue.put("enters", false);
        ExpectedValue.put("string", false);
        ExpectedValue.put("and", false);
        ExpectedValue.put("sort", false);

        assertEquals(ExpectedValue, ActualValue);
    }
}