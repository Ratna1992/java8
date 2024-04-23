package com.ratna.play.optional;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        String[] str = new String[10];
        List<String> asList = Arrays.asList("33", null, "4", "2", "1", "23");
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");

        //Optional.of vs Optional. ofNullable
        Optional<List<String>> ofNullable = Optional.ofNullable(asList);
        ofNullable.ifPresent(System.out::println);

        Optional<List<String>> asList1 = Optional.ofNullable(asList);
        asList1.ifPresent(System.out::println);

        Optional.ofNullable(asList).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull)
                .forEach(System.out::println);
        asList.stream().filter(Objects::nonNull).forEach(System.out::println);

        String strng = "null check";

        String string = Optional.of(strng).get();
        System.out.println(string);

        String string1 = Optional.ofNullable(strng).get();
        System.out.println(string1);
        strng = null;

        try {
            Optional<String> string2 = Optional.of(strng);
            System.out.println("Optional.of(str)" + string2);
            System.out.println(string2.get());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            Optional<String> string3 = Optional.ofNullable(strng);
            System.out.println("Optional.ofNullable(str)" + string3);
            System.out.println(string3.get());
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }




    }






}
