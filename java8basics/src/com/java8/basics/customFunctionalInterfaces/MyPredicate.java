package com.java8.basics.customFunctionalInterfaces;

/**
 * Created by gurinder on 4/9/16.
 */
@FunctionalInterface
public interface MyPredicate<E> {
    boolean test(E e);
}
