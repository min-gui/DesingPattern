package factory;

class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza creatPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleCheesPizza();
        }
        return null;
    }
}
