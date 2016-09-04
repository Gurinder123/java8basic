package com.java8.basics.usingfunctionaldefaultmethods;

import com.java8.basics.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by gurinder on 4/9/16.
 */
public class PredicateTesting {
    public static void main(String[] args) {
        List<Apple> myAppleList = new ArrayList<>();
        myAppleList.add(new Apple("Red", 30));
        myAppleList.add(new Apple("Green", 30));
        myAppleList.add(new Apple("Pink", 30));
        Predicate<Apple> predicateToCheckRed = a -> a.getColor().equals("Red");
        Predicate<Apple> predicateToCheckGreen = a -> a.getColor().equals("Green");
        Predicate<Apple> predicateToCheckWeight = a -> a.getWeight() > 20;
        myAppleList.stream().filter(a -> predicateToCheckRed.or(predicateToCheckGreen).test(a)).forEach(System.out::println);
        System.out.println("Next predicate");
        myAppleList.stream().filter(a -> predicateToCheckRed.or(predicateToCheckGreen).and(predicateToCheckWeight).test(a)).forEach(System.out::println);
        System.out.println("Next predicate");
        myAppleList.stream().filter(a -> predicateToCheckRed.or(predicateToCheckGreen).and(predicateToCheckWeight).negate().test(a)).forEach(System.out::println);

    }
}
