package factory.abstractFactory;

import java.util.ArrayList;

abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting pizza");
    }
    void box() {
        System.out.println("boxing in pizza");
    }
    void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
