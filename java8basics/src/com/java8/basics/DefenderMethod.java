package com.java8.basics;

interface Eatable {
    default void eat() {
        System.out.println("Yess i eat");
    }

}

public class DefenderMethod implements Eatable {
    public static void main(String[] args) {
        Eatable eat_obj = new DefenderMethod();
        eat_obj.eat();
    }
}
