import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
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
    public void TestSuccess() {

        Map ActualValue = MapObject.hashmethod("first", "second", "value1", "value2");

        Map obj = new HashMap<String, String>();
        obj.put("first", " ");
        obj.put("second", "xyz");
        Map ExpectedValue = obj;
        assertEquals(ActualValue, ExpectedValue);

    }
}