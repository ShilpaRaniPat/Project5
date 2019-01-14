package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mapWithBoolean {

    public Map<String,Boolean> numberOfCounts(String str){
        Map<String,Integer> map = new HashMap<>();
        Map<String,Boolean> mapBoolean = new HashMap<String,Boolean>();
        String[] strArray = str.split(" ");
        for(int i=0;i<strArray.length;i++) {
            Matcher matcher = Pattern.compile(strArray[i]).matcher(str);
            int counter = 0;
            while (matcher.find()) {
                counter++;
            }
            map.put(strArray[i],counter);
            if(counter>=2)
                mapBoolean.put(strArray[i],true);
            else
                mapBoolean.put(strArray[i],false);
        }
        return mapBoolean;

    }
}

