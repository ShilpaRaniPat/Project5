package com.stackroute.pe5;

import java.util.*;

public class MapKeyValue {


    public Map hashmethod(LinkedHashMap<String,String> input) {
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<String, String>();
        String key1 = input.get(input.values().toArray()[0]);
        String value1 = input.get(input.keySet().toArray()[0]);
        if(value1 != null)
        {
            input.put("val1"," ");
            input.put("val2",value1);

        }

        return input;
    }



    }

