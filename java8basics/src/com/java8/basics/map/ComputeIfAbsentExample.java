package com.java8.basics.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gurinder on 18/11/16.
 */
public class ComputeIfAbsentExample {
    public static void main(String[] args) {
        Map<String, String> myStringMap = new HashMap<>();
        myStringMap.put("1", "A");
        myStringMap.put("2", "B");
        myStringMap.put("3", "C");
        myStringMap.put("4", "D");

        System.out.println(myStringMap);
        /*will not change and add changed because 1 is present*/
        myStringMap.computeIfAbsent("1", m -> "changed");
        /*will change and add new key value 5=changed because 5 is not present*/
        myStringMap.computeIfAbsent("5", m -> "changed");
        System.out.println(myStringMap);
    }
}
