package factory.abstractFactory;



class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");

        System.out.println(pizza.dough);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println("Ethan ordered a " + pizza.getName() + " \n");


        PizzaStore ciStore = new ChicagoPizzaStore();
        Pizza cipizza = ciStore.orderPizza("cheese");
        System.out.println(cipizza.dough);
        System.out.println(cipizza.sauce);
        System.out.println("Ethan ordered a " + cipizza.getName() + " \n");

    }
}
