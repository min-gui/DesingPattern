package interandabtest;

public interface Movable {

    default void doSomething(int n){
        System.out.println("doSomeThing(Movable)");
    }
}
