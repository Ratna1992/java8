package com.ratna.play.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {

        //Understanding the problem without method overriding
        MangoTree mangoTree = new MangoTree();
        mangoTree.type();
        //Problem is that I have to provide a specific implementation of the type() method in subclass that is why we use method overriding.

        //overcoming the problem
        AppleTree appleTree = new AppleTree();
        appleTree.type();
        //Resolved Problem by providing specific implementation of the type() method in subclass that is why we use method overriding.
    }
}
