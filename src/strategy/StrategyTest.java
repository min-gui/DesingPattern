package strategy;

public class StrategyTest {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        User user1 = new User("book", 1,5000);
        User user2 = new User("pen", 2,3000);

        shoppingCart.addItem(user1);
        shoppingCart.addItem(user2);

        shoppingCart.pay(new KAKAOCardStrategy("min","ff","123","1233"));
        shoppingCart.pay(new NaverCardStrategy("min","ff@ddd"));

    }
}
