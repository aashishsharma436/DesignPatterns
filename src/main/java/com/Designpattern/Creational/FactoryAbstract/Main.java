package com.Designpattern.Creational.FactoryAbstract;

public class Main {
    /*
    The Abstract factory pattern is a way of organizing how you create groups of things that are related to each other. It provides a set of
    rules or instructions that let you create different types of things without knowing exactly what those things are.

    This helps you keep everything organized and lets you switch between different types easily.

    1. Abstract Factory pattern is almost same as Abstract pattern and is considered as another layer of abstraction over factory pattern.
    2. Abstract Factory pattern work around a super-factory which creates other factories.
    3. At runtime, the abstract factory is coupled with any desired concrete factory which can create objects of the desired type.
     */
    public static void main(String[] args) {
        CarFactory northAmericanFactory = new NorthAmericaCarFactory();
        Car northAmericanCar = northAmericanFactory.createCar();
        CarSpecification northAmericaSpec = northAmericanFactory.createSpecification();

        northAmericanCar.assemble();
        northAmericaSpec.display();


        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification euroSpec = europeFactory.createSpecification();

        europeCar.assemble();
        euroSpec.display();
    }

    /*
    Benefits:
    1. The Abstract factory pattern separates the creation of objects, so clients don't need to know specific classes.
    2. Clients interact with objects through abstract interfaces, keeping class names hidden from client code.
    3. Changing the factory allows for different product configurations, as all related products change together.
    4. The pattern ensures that an application uses objects from only one family at a time for better compatibility.

    Challenges:
    1. The Abstract factory pattern can add unnecessary complexity to simpler projects with multiple factories and interfaces.
    2. Adding new product types may require changes to both concrete factories and the abstract factory interfaces, impacting existing code.
    3. Introducing more factories and product families can quickly increase the number of classes, making code management difficult in smaller projects.
    4. It may violate the dependency inversion principle if client code depends directly on concrete factories rather than abstract interfaces.

    When to use:
    1. When your system requires multiple families of related products, and you want to ensure compatibility between them.
    2. When you need flexibility and extensibility, allowing for new product variants to be added without changing existing client code.
    3. When you want to encapsulate the creation logic, making it easier to modify or extend the object creation process without affecting the client.
    4. When you aim to maintain consistency across different product families, ensuring a uniform interface for the products.

    When not to use:
    1. When the product families are unlikely to change, as it may add unnecessary complexity,
    2. When your application only requires single, independent objects and isn't connected with families of related products.
    3. When overhead of maintaining multiple factories outweighs the benefits, particularly in smaller applications.
    4. When simpler solutions, like the factory Method or Builder pattern, if they meet your need without adding the complexity of the Abstract Factory pattern

     */
}
