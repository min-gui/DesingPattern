package factory;

abstract class PizzaStore {

    protected abstract Pizza creatPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = creatPizza(type);

        //피자 준비
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        //피자 굽기
        //피자 자르기
        //피자 박스에넣기

        return pizza;
    }


}
