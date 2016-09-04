package com.java8.basics.customFunctionalInterfaces;

import com.java8.basics.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gurinder on 4/9/16.
 */
public class Main {
    public static void main(String[] args) {
        List<Apple> myAppleList = new ArrayList<>();
        myAppleList.add(new Apple("Red", 30));
        myAppleList.add(new Apple("Green", 30));
        myAppleList.add(new Apple("Red", 35));
        myAppleList.add(new Apple("Pink", 30));
        MyPredicate<Apple> appleMyPredicate = a -> a.getColor().equals("Red") && a.getWeight() > 20;
        myAppleList.stream().filter(a -> appleMyPredicate.test(a)).forEach(System.out::println);
    }
}
