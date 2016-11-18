package com.java8.basics.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gurinder on 18/11/16.
 */
public class ComputeIfPresentExample {
    public static void main(String[] args) {
        Map<String, String> myStringMap = new HashMap<>();
        myStringMap.put("1", "A");
        myStringMap.put("2", "B");
        myStringMap.put("3", "C");
        myStringMap.put("4", "D");

        System.out.println(myStringMap);
        /*1 is present as a key so it will change  the value*/
        myStringMap.computeIfPresent("1", (m1, m2) -> {
            if ((m1 + m2).equals("1A"))
                return "Changed";
            else
                return "Not-Changed";
        });

        /*5 is not present as a key so it will not change anything*/
        myStringMap.computeIfPresent("5", (m1, m2) -> {
            if ((m1 + m2).equals("1A"))
                return "Changed";
            else
                return "Not-Changed";
        });

        System.out.println(myStringMap);
    }

}
