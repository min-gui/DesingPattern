package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<User> items;

    public ShoppingCart() {
        this.items = new ArrayList<User>();
    }

    public void addItem(User user){
        this.items.add(user);
    }

    public void removeItem(User user) {
        this.items.remove(user);
    }

    public int calculateTotal() {
        int sum = 0;
        for (User user : items) {
            sum += user.getPrice();
        }

        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
