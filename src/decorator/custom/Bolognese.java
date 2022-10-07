package decorator.custom;

public class Bolognese extends Pasta{

    public Bolognese() {
        super();
        name = "볼로네제";
    }

    @Override
    public int cost() {
        return 10000;
    }
}
