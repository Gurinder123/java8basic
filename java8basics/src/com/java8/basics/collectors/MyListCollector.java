package com.java8.basics.collectors;

import com.java8.basics.Apple;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by gurinder on 3/10/16.
 */
public class MyListCollector {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Red", 100);
        Apple apple2 = new Apple("Green", 100);
        Apple apple3 = new Apple("Yellow", 100);
        Apple apple4 = new Apple("Red", 200);
        List<Apple> appleList = new ArrayList() {{
            add(apple1);
            add(apple2);
            add(apple3);
            add(apple4);
        }};
        List<Apple> newList = appleList.stream().filter(a -> a.getColor().startsWith("R") || a.getWeight() > 100).collect(toList());
        newList.stream().forEach(System.out::println);
    }
}
