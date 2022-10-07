package decorator.custom;

public class Vongole extends Pasta{
    public Vongole() {
        name = "봉골레";
    }

    @Override
    public int cost() {
        return 12000;
    }
}
