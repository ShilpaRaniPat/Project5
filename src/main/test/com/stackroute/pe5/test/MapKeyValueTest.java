package com.stackroute.pe5.test;

import com.stackroute.pe5.MapKeyValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapKeyValueTest {
    MapKeyValue MapObject = new MapKeyValue();

    @Before
    public void setUp() throws Exception {
        MapKeyValue MapObject = new MapKeyValue();
    }

    @After
    public void tearDown() throws Exception {
        MapObject = null;
    }


    @Test
    public void testSuccessforMap() {
        LinkedHashMap<String, String> inpMap = new LinkedHashMap<String, String>();
        inpMap.put("val1", "myvalue");
        inpMap.put("val2", "yourvalue");
        Map<String, String> actualStr = MapObject.hashmethod(inpMap);
        LinkedHashMap<String, String> expectedStr = new LinkedHashMap<String, String>();
        expectedStr.put("val1", " ");
        expectedStr.put("val2", "myvalue");
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFailureforMap() {
        LinkedHashMap<String, String> inpMap = new LinkedHashMap<String, String>();
        inpMap.put("val1", "myvalue");
        inpMap.put("val2", "yourvalue");
        Map<String, String> actualStr = MapObject.hashmethod(inpMap);
        LinkedHashMap<String, String> expectedStr = new LinkedHashMap<String, String>();
        expectedStr.put("val1", "notpass");
        expectedStr.put("val2", "myvalue");
        assertNotEquals(expectedStr, actualStr);
    }

    @Test
            (expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(MapObject.hashmethod(null));
    }


}
