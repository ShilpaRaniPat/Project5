package com.stackroute.pe5;

import java.util.*;

public class hashFunction {


    public ArrayList myfunction(String s) {
        TreeSet myTreeSet = new TreeSet(Arrays.asList(s.split(" ")));
        ArrayList sortedList = new ArrayList(myTreeSet);
        return sortedList;
    }
}
