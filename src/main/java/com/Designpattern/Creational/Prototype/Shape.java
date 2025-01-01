package com.Designpattern.Creational.Prototype;

/*
Components
1. Prototype Interface or Abstract class:
    -> This defines the method of cloning objects and sets a standard that all concrete prototypes must follow. Its main purpose is
        to serve as a blueprint for creating new Objects by outlining the cloning contract.
    -> It includes a clone method that concrete prototypes will implement to create copies of themselves.

2. Concrete Prototype:
    -> This class implements the prototype interface or extends ths abstract class. It represents a specific types of Object that
        can be cloned.
    -> This concrete prototype details how the cloning process should work for instances of that class and provides the specific
        logic for the clone method.

3. Client:
    -> The Client is the code or module that requests new object creation by interacting with the prototypes.
    -> It initiates the cloning process without needing to know the specifics of the concrete classes involved.

4. Clone Method:
    -> This Method is declared in the prototype interface or abstract class and outlines how an object should be copied.
    -> Concrete prototypes implement this method to define their specific cloning behavior, detailing how to duplicate the object's
       internal state to create a new, independent instance.
 */


// Prototype interface
public interface Shape {
    Shape clone();
    void draw();
}

// Concrete Prototype

class Circle implements Shape{
    private String color;

    public Circle(String color){this.color = color;}

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a "+color+" circle.");
    }
}

// Client
class ShapeClient{
    private Shape shape;

    public ShapeClient(Shape shape){
        this.shape = shape;
    }

    public Shape createShape(){
        return shape.clone();
    }
}
