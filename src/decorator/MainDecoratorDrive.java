package decorator;

public class MainDecoratorDrive {

    public static void main(String[] args) {
        Strings strings = new Strings();

        strings.add("hello");
        strings.add("my name min");
        strings.add("i am spring developer");
        strings.add("Design-pattern is powerful tool");

        Item sideDecorator = new SideDecorator(strings, '\"');

        sideDecorator.print();
    }
}
