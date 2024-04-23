package com.ratna.play.lambdaexp;

import java.sql.SQLOutput;

public class WithoutLambdaExample {
    public static void main(String[] args) {
        String message="Hello, How are you!!";
        //without lambda, Greetings implementation using anonymous class
        Greetings greetings = new Greetings() {
            @Override
            public void greet() {
                System.out.println(message);
            }
        };
        greetings.greet();
    }
}
