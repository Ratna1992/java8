package com.ratna.play.polymorphism;

public class MethodOverloadingAndTypePromotion {
    public static void main(String[] args) {
        MethodOverloadingAndTypePromotion typePromotion = new MethodOverloadingAndTypePromotion();
        //Example of Method Overloading with TypePromotion
        //now second char literal will be promoted to long
        typePromotion.sum(10, 'a');
        typePromotion.sum(20, 30, 40);

        //Example of Method Overloading with Type Promotion if matching found
        typePromotion.sum(20, 20);//now int arg sum() method gets invoked

        //Example of Method Overloading with Type Promotion in case of ambiguity
       // typePromotion.sub(20,20);
    }

    void sub(int a, long b) {
        System.out.println("a method invoked");
    }

    void sub(long a, int b) {
        System.out.println("b method invoked");
    }

    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }
}
