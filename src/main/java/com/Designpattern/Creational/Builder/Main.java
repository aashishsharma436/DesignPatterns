package com.Designpattern.Creational.Builder;

public class Main {
    /*
    1. This Design Pattern is used in software design to construct a complex object step by step.
    2. It allows the construction of a product in a step-by-step manner, where construction process can change based on the type of product being built.
    3. This pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

    When to use:
    1. When an object has a large number of optional parameters
    2. When creating an object requires multiple steps or configurations.
     */

    public static void main(String[] args) {
        HouseDirector builder = new HouseDirector(new ConcreteHouseBuilder());
        House house = builder.constructHouse();
        System.out.println(house);
    }
}
