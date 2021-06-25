package factory.abstractFactory;

class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza creatPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);

            System.out.println();
            pizza.setName("New York Style Cheese Pizza");
        }else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
