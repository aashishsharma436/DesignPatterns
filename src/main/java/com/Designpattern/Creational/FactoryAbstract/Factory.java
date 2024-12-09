package com.Designpattern.Creational.FactoryAbstract;

    /*
    Components of Abstract Factory Pattern:
    To understand abstract factory pattern, we have to understand the components of it and relationships between them.

    1. Abstract Factory:
        ->  Abstract Factory provides a high-level blueprint that defines rules for creating families of related objects without specifying
            their concrete classes.
        ->  It provides a way such that concrete factories follow a common interface, providing consistent way to produce related set of objects.
    2. Concrete Factories:
        ->  Concrete factories implement the rules specified by the abstract factory It contains the logic for creating specific instances of
            objects within a family.
        ->  Also multiple concrete factories can exist, each produce a distinct family of related objects.
    3. Abstract Products:
        ->  Abstract products represents a family of related objects by defining a set of common methods or properties.
        ->  It acts as an abstract or interface type that all concrete products within a family must follow to and provides a unified way for
            concrete products to be used interchangeably.
    4. Concrete products:
        ->  They are the actual instances of objects created by concrete factories.
        ->  They implement the methods declared in the abstract products, ensuring consistency within a family and belong to a specific category
            or family of related objects.
    5. Client:
        ->  Client utilizes the abstract factory to create families of objects without specifying their concrete types and interacts with objects
            through abstract interfaces provided by abstract products.
     */
interface CarFactory{
    Car createCar();
    CarSpecification createSpecification();
}

class NorthAmericaCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}

class EuropeCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}


interface Car{
    void assemble();
}

interface CarSpecification{
    void display();
}

class Sedan implements Car{

    @Override
    public void assemble() {
        System.out.println("Assembling Sedan Car");
    }
}

class Hatchback implements Car{

    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback Car");
    }
}

class NorthAmericaSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("North America Car specifications: Safety features complaint with local regulations");
    }
}

class EuropeSpecification implements CarSpecification{

    @Override
    public void display() {
        System.out.println("Europe Car specifications: Fuel efficiency and emissions complaint with EU standards");
    }
}