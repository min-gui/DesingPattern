package interandabtest;

public class Car implements Vehicle, Movable{

    @Override
    public void doSomething(int n) {
        System.out.println("dosomethidn(car)");
    }
}
