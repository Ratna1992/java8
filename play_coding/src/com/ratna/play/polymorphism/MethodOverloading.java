package com.ratna.play.polymorphism;

public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    //method overloading is not possible by changing the return type of the method only because of ambiguity
//    static double add(int a, int b) {
//        return a + b;
//    }


    public static void main(String[] args) {
        //Method Overloading: changing no. of arguments
        System.out.println("Method Overloading: changing no. of arguments");
        System.out.println(MethodOverloading.add(11, 11));
        System.out.println(MethodOverloading.add(11, 11, 11));

        //Method Overloading: changing data type of arguments
        System.out.println("ethod Overloading: changing data type of arguments");
        System.out.println(MethodOverloading.add(11, 11));
        System.out.println(MethodOverloading.add(11.2, 11.6, 11.9));

    }
}
