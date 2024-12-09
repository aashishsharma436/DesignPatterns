package com.Designpattern.Creational.Prototype;

public class Main {
    /*
    1.  This Design pattern is used when object creation is time-consuming and costly operation. So, we create objects with the existing
        objects itself to by copying the existing ones.
    2.  The newly copied object may change the same properties only if required. This approach saves costly resources and time, especially
        when object creation is a heavy process.
    3.  One of the best available ways to create an object from existing objects is the clone() method. Clone is the simplest approach to
        implementing a prototype pattern. However, it is your call to decide how to copy existing objects bases on your business model.
     */
    public static void main(String[] args) {
        //Create a concrete prototype
        Shape circle = new Circle("Red");

        //Create a client and give it the prototype
        ShapeClient client = new ShapeClient(circle);

        // Use the prototype to create a new shape
        Shape redCircle = client.createShape();

        redCircle.draw();
        Shape another = redCircle.clone();

    }
}
/*
When to use:
1. Use the prototype pattern when creating new objects is more complex or costly than copying existing ones. Cloning can be more
   efficient if significant resources are needed.
2. The prototype pattern is helpful for managing various objects with minor differences. Instead of creating multiple classes, you can
   clone and modify prototypes.
3. Consider the prototypes pattern for dynamic configurations where you need to create objects at runtime. You can clone a base configuration
   and adjust it as necessary.
4. The Prototype pattern can lower initialization costs, as cloning is often faster than building a new object from scratch, especially if
   initialization is resource-intensive.

When not to use:
1. When your application predominantly deals with unique object instances, and the overhead of implementing the pattern outweighs its benefits.
2. If object creation is simple and does not involve significant resource consumption, and there is no variations of objects, using the
   prototypes pattern might be unnecessary complexity.
3. If your objects are immutable(unchangeable) and do not need variations, the benefits of cloning may not be significant.
4. If your system has a clear and straightforward object creation process that is easy to understand and manage, introducing this pattern
   may add unnecessary complexity.
 */
