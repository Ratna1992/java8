package com.ratna.play.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ShortCircutingExample {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5, 6};

        //without limit
        Arrays.stream(ints).filter(i->i%2==0).forEach(System.out::println);

        //limit()
        Arrays.stream(ints).filter(i->i%2==0).limit(2).forEach(System.out::println);

        //findFirst
        OptionalInt stream = Arrays.stream(ints).filter(i -> i % 3 == 0).findFirst();
            if(stream.isPresent()){
                System.out.println(stream.getAsInt());
            }

    }
}
