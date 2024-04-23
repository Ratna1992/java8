package com.ratna.play.lambdaexp;

public class LambdaExample {

    public static void main(String[] args) {
        String message="Hello, How are you!!";
        String person = "ratna";
        //with Lambda no parameters
        Greetings greetings = ()->System.out.println(message);
        greetings.greet();

        //with Lambda single parameters
        Wishes wishes = (name)->System.out.println(message + name);
        wishes.wish(person);

        //with Lambda multiple  parameters and return int
        Add add = (a,b)->a+b;
        add.add(3,6);


    }
}
