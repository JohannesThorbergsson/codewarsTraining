package org.example;

import java.util.ArrayList;
import java.util.List;

public class DirReduce {
    public static void main(String[] args) {
        dirReduc((new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    }
    public static String[] dirReduc(String[] arr) {
        List<String> currentDirs = new ArrayList<>(List.of(arr));
        int lengthOld;
        do {
            lengthOld = currentDirs.size();
            for(int i =0; i< currentDirs.size()-1; i++) {
                if(isReduce(currentDirs.get(i), currentDirs.get(i+1))){
                    currentDirs.remove(i);
                    currentDirs.remove(i);
                }
            }

        } while (lengthOld>currentDirs.size());
        return currentDirs.toArray(new String[0]);
    }

    public static boolean isReduce(String s1, String s2){
        return s1.equals("NORTH") && s2.equals("SOUTH") || s1.equals("SOUTH") && s2.equals("NORTH")
                || s1.equals("WEST") && s2.equals("EAST") || s1.equals("EAST") && s2.equals("WEST");
    }
}
