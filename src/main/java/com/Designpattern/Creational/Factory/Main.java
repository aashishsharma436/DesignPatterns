package com.Designpattern.Creational.Factory;

public class Main {
    /*
    1. This pattern is typically helpful when it's necessary to separate the construction of an object from its implementation.
    2. With the use of this design pattern,  objects can be produced without having to define the exact class of object to be created.
    3. This pattern simplifies the object creation process by placing it in a dedicated method, promoting loose coupling between the
        object creator and object itself.
    4. This approach enhances flexibility, extensibility, and maintainability, enabling subclass to implement their own factory methods
        for  creating specific object Types.

    When to use:
    1. If your object creation process is complex or varies under different conditions, using factory method can make your client
        code simpler and promote reusability.
    2. The factory method pattern allows you to create objects through an interface or abstract class, hiding details of concrete
        implementations. This reduces dependency and makes it easier to modify or expand the system without affecting existing code.
    3. If your application needs different versions of products or may introduce new types in the future, the factory Method provides a
        flexible way to handle these variations by defining specific factory methods for each product type.
    4. Factories can encapsulate configuration logic, allowing clients to customize the object creation process by providing parameters
        or options to the factory method.

     */
    public static void main(String[] args) {
        Client twoWheeler = new Client(new TwoWheelerFactory());
        Client fourWheeler = new Client(new FourWheelerFactory());

        Vehicle two = twoWheeler.getVehicle();
        Vehicle four = fourWheeler.getVehicle();

        two.printVehicle();
        four.printVehicle();
    }

    /*
    Use Case of the factory Method:
    1. Used in JDBC for creating connections and in frameworks like Spring and managing beans
    2. Libraries like Swing and javaFX use factories to create flexible UI components.
    3. Tools like Log4j rely on factories to create configurable loggers.
    4. Factories help create objects from serialized data, supporting various formats.


    Advantages of the factory Method:
    1. Separates creation logic from client code, improving flexibility
    2. New product types can be added easily.
    3. Simplifies unit testing by allowing mock product creation.
    4. Centralizes object creation logic across the application
    5. Hides specific product classes from clients, reducing dependency.

    Disadvantages of the Factory Method:
    1. Adds more classes and interfaces, which can complicate maintenance.
    2. Slight performance impacts due to polymorphism.
    3. Concrete creators are linked to their products.
    4. Clients need knowledge of specific subclasses.
    5. May lead to unnecessary complexity if applied too broadly.
    6. Factory logic can be harder to test.
     */
}
