package decorator.custom;

public class Pomodoro extends Pasta{
    public Pomodoro() {
        super();
        name = "포모도로";
    }

    @Override
    public int cost() {
        return 8000;
    }
}
