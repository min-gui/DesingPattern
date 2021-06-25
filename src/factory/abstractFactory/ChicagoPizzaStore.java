package factory.abstractFactory;

class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza creatPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("cicago cheese pizza");
        }else if (item.equals("clams")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("cicago clams pizza");
        }
        return pizza;
    }
}
