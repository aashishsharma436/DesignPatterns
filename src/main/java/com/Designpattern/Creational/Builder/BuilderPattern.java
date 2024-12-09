package com.Designpattern.Creational.Builder;


/*
    Key Components:
    1. Builder: Abstract interface or class defining the steps to build the object.
    2. Concrete Builder: Implements the steps defined in the builder
    3. Director: Oversees the building process and interacts with the Builder.
 */


// Define the Product
class House{
    private String foundation;
    private String structure;
    private String roof;
    private String hasGarden;

    public void setHasGarden(String hasGarden) { this.hasGarden = hasGarden; }
    public void setRoof(String roof) { this.roof = roof; }
    public void setStructure(String structure) { this.structure = structure; }
    public void setFoundation(String foundation){ this.foundation = foundation; }

    public String getFoundation(){ return this.foundation;}
    public String getStructure(){ return this.structure;}
    public String getRoof(){return this.roof;}
    public String getHasGarden(){ return this.hasGarden;}

    @Override
    public String toString(){
        return "House [Foundation: "+foundation +", structure: "+structure+", roof: "+roof+", Garden: "+hasGarden;
    }
}

//Define the Builder interface
interface HouseBuilder{
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildGarden();
    House getHouse();
}

//Define Concrete Builder
class ConcreteHouseBuilder implements HouseBuilder{

    private House house;
    public ConcreteHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
        System.out.println("Foundation Built");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete Structure");
        System.out.println("Structure Built");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete Roof");
        System.out.println("Roof Built");
    }

    @Override
    public void buildGarden() {
        house.setHasGarden("Concrete Garden");
        System.out.println("Garden Built");
    }

    @Override
    public House getHouse() {
        return house;
    }
}

class HouseDirector{
    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder){
        this.builder = builder;
    }

    public House constructHouse(){
        builder.buildFoundation();
        builder.buildGarden();
        builder.buildStructure();
        builder.buildRoof();
        return builder.getHouse();
    }
}
