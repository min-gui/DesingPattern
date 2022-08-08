package strategy;

public class User {
    private String name;
    private int productNo;
    private int price;

    public User(String name, int productNo, int price) {
        this.name = name;
        this.productNo = productNo;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getProductNo() {
        return productNo;
    }

    public int getPrice() {
        return price;
    }
}
