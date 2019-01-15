package com.stackroute.pe5.test;

import com.stackroute.pe5.CountWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNull;

public class CountWordsTest {
    CountWords countObj=new CountWords();


    @Before
    public void setUp() throws Exception {

        CountWords countObj=new CountWords();
    }

    @After
    public void tearDown() throws Exception {
        countObj=null;
    }


    @Test
    public void  testForCountSuccess(){
        Map<String,Integer> testMapExpected = new HashMap<>();
        testMapExpected.put("one",3);
        testMapExpected.put("two",1);
        testMapExpected.put("one",2);

        Map<String,Integer> resultmapActual= countObj.numberOfCounts("one one -one___two,,three,one @three*one?two");



    }
    @Test
    public void  testForCountFailure(){
        Map<String,Integer> testMapExpected = new HashMap<>();
        testMapExpected.put("one",3);
        testMapExpected.put("two",2);
        testMapExpected.put("one",2);

        Map<String,Integer> resultmapActual= countObj.numberOfCounts("one one -one___two,,three,one @three*one?two");



    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(countObj.numberOfCounts(null));
    }
}