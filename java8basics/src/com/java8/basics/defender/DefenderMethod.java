package com.java8.basics.defender;

interface Eatable {
    default void eat() {
        System.out.println("Yess i eat");
    }

    default void price() {
        System.out.println("12$");
    }

}

interface Bounceable extends Eatable {
    default void eat() {
        System.out.println("Yess i eat");
    }

    default void price() {
        Eatable.super.price();
        System.out.println("15$");
    }

}

public class DefenderMethod implements Eatable, Bounceable {
    public static void main(String[] args) {
        Eatable eat_obj = new DefenderMethod();
        eat_obj.price();
    }
}
