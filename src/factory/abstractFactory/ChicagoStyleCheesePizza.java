package factory.abstractFactory;

class ChicagoStyleCheesePizza extends Pizza {
    ChicagoStyleCheesePizza(){
        name = "chicago cheese pizza";
    }

    @Override
    void prepare() {

    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
