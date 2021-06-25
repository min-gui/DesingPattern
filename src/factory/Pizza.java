package factory;



import java.util.ArrayList;

class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing " +  name);
        System.out.println("Tossing dough " +  name);
        System.out.println("Adding sauce.. " +  name);
        System.out.println("Adding topping.. " +  name);

        for (int i = 0 ; i < toppings.size(); i++){
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting pizza");
    }
    void box() {
        System.out.println("boxing in pizza");
    }

    public String getName(){
        return name;
    }
}
