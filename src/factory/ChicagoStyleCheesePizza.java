package factory;

class ChicagoStyleCheesePizza extends Pizza{
    ChicagoStyleCheesePizza(){
        name = "chicago cheese pizza";
        dough = "thick dough";
        sauce = "tomato sauce";

        toppings.add("mozzarella cheese");


    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
