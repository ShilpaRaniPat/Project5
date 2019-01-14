package com.stackroute.pe5.test;

import com.stackroute.pe5.updateAndRemove;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class updateAndRemoveTest {
    updateAndRemove uar = new updateAndRemove();


    @Before
    public void setUp() throws Exception {
        updateAndRemove uar = new updateAndRemove();
    }

    @After
    public void tearDown() throws Exception {
        uar = null;
    }

    @Test
    public void testforandReplaceSuccess() {

        ArrayList<String> ExpectedValue = new ArrayList<String>();
        ExpectedValue.add("I");
        ExpectedValue.add("it");
        ExpectedValue.add("just");
        ExpectedValue.add("started");
        ExpectedValue.add("the");
        ExpectedValue.add("assignment");
        ArrayList<String> ActualValue = uar.creation("I have just started the assignment", "have", "it");
        assertEquals(ExpectedValue, ActualValue);


    }

    @Test
    public void testforandReplaceFailure() {

        ArrayList<String> ExpectedValue = new ArrayList<String>();
        ExpectedValue.add("I");
        ExpectedValue.add("have");
        ExpectedValue.add("just");
        ExpectedValue.add("started");
        ExpectedValue.add("the");
        ExpectedValue.add("assignment");
        ArrayList<String> ActualValue = uar.creation("I have just started the assignment", "have", "it");
        assertNotEquals(ExpectedValue, ActualValue);

    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(uar.creation(null,null,null));
    }
}