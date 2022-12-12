package interandabtest;

public interface Vehicle {
    public default void doSomething(int n) {
        System.out.println("doSomething(Vehicle)");
    }
}
