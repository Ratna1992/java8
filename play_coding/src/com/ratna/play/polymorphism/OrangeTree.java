package com.ratna.play.polymorphism;

public class OrangeTree extends Tree{
    @Override
    public void type() {
        System.out.println("I am an orange tree");
    }
    public OrangeTree carry(){
        return this;
    }
    void message(){System.out.println("welcome to covariant return type");}
}
