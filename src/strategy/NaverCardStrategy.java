package strategy;

public class NaverCardStrategy implements PaymentStrategy{

    private String name;
    private String email;



    public NaverCardStrategy(String name, String email) {
        this.name = name;
        this.email = email;

    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +": 네이버 카드로 계산");
    }
}
