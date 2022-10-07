package decorator.custom;

public class Customer {

    public static void main(String[] args) {
        Pasta pasta = new Pomodoro();
        pasta = new RedPepper(pasta);
        pasta = new RedPepper(pasta);
        pasta = new RedPepper(pasta);

        System.out.println("메뉴 이름 = " + pasta.getName());
        System.out.println("가격 = " + pasta.cost());
    }
}
