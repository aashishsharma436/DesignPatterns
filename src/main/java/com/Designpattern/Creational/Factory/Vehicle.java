package com.Designpattern.Creational.Factory;

/*
Components of Factory Design Method
    1. Creator: This is an abstract class or interface that declares the factory method. The creator typically contains a method
                that serves as a factory for creating objects. It may contain other method that work with the created objects.

*/
interface VehicleFactory{
    Vehicle createVehicle();
}
/*

    2. Product: This is the interface or abstract class for the objects that the factory method creates. The product defines the common
                interface for all objects that the factory method can create.
 */
public abstract class Vehicle {
    public abstract void printVehicle();
}

/*
    3. Concrete Creator: Concrete creator are subclasses of the creator that implements the factory method to create specific types
                         of objects. Each concrete creator is responsible for creating a particular product.

*/
class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
/*
    4. Concrete Product: Concrete product classes are the actual objects that the factory method creates. Each Concrete product class
                         implements the product interface or extends the Product abstract class.
 */
class TwoWheeler extends Vehicle{

    @Override
    public void printVehicle() {
        System.out.println("This is a Two Wheeler class");
    }
}

class FourWheeler extends Vehicle{

    @Override
    public void printVehicle() {
        System.out.println("This is the four wheeler class");
    }
}

/*

 */
class Client{
    private Vehicle vehicle;

    public Client (VehicleFactory factory){
        vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
