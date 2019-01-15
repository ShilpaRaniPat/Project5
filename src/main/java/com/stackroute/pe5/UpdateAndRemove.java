package com.stackroute.pe5;

import java.util.*;

import static java.util.Arrays.asList;

public class UpdateAndRemove {
    public ArrayList<String> creation(String s, String word, String toreplace) {
        List<String> wordList = Arrays.asList(s.split(" "));
        if(wordList.contains(word)){
            int i=wordList.indexOf(word);

            wordList.set(i,toreplace);
        }
        ArrayList<String> arrNew = new ArrayList<String>();
        arrNew.addAll(wordList);
        return arrNew;
    }
}

