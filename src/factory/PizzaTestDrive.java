package factory;

class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");

        System.out.println("Ethan ordered a " + pizza.getName() + " \n");
    }
}
