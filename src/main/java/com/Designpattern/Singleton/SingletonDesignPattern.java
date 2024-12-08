package com.Designpattern.Singleton;

public class SingletonDesignPattern {
    /*
    Principles:
    1. Singleton ensures that only one instance of the class exists throughout the application.
    2. Provide a global point of access to that instance.
    3. Support creating the instance when you need(Lazy instantiation) or when class is loaded (Eager instantiation)
    4. Implements mechanism to prevent multiple threads from creating separate instances simultaneously.
    5. Restrict Direct instantiation by making constructor private, forcing the use of access point.

    when to use:
    1. When you need to ensure that only instance of a class throughout the application.
    2. Use it when you want to provide a straightforward way for clients to access that instance form a specific location of your code.
    3. If you think, you might want to extend the class later, singleton pattern is a good choice, It allows
        subclassing, so clients can work with the extended version without changing the original Singleton.
    4. This pattern is often used in like logging, managing connections to hardware or databases, caching data
        or handling thread pools, where having just one instances making sense

     */

    private static SingletonDesignPattern instance;

    private SingletonDesignPattern(){
        System.out.println("Singleton is Instantiated");
    }
    public static SingletonDesignPattern getInstance(){
        if (instance == null) instance = new SingletonDesignPattern();
        return instance;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }
}

class Demo{
    public static void main(String[] args) {
        SingletonDesignPattern.getInstance().doSomething();
    }
}
