package com.stackroute.pe5.test;

import com.stackroute.pe5.HashFunction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

//import static com.sun.tools.doclint.Entity.and;
import static org.junit.Assert.*;

public class HashFunctionTest {
    HashFunction func=new HashFunction();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        func=null;
    }
    @Test
    public void  testforsort(){
        ArrayList Actualvalue=func.myfunction("enter the string and sort");
        ArrayList word=  new ArrayList<String>();
        word.add("and");
        word.add("enter");
        word.add("sort");
        word.add("string");
        word.add("the");
        ArrayList ExpectedValue=word;
        assertEquals(ExpectedValue,Actualvalue);


    }
}