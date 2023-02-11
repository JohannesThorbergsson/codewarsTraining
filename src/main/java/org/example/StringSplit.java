package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static void main(String[] args) {
        solution("EpicMasterString5");
    }

    public static String[] solution(String s) {
        List<String> result = new ArrayList<>();
        for (int i=0; i<s.length(); i+=2) {
            if(i<s.length()-1) {
                result.add(s.substring(i, i+2));
            } else {
                result.add(s.substring(i)+"_");
            }
        }
        return result.toArray(new String[0]);
    }
}