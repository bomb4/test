package entities;

import java.util.List;

public class Order {

    private User user;
    private List<Product> products;

    private Order() {
    }

    public Order setUser(User user) {
        this.user = user;
        return this;
    }

    public Order setProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    public User getUser() {
        return user;
    }

    public int getUserAge(){
        return user.getAge();
    }

    public static Order createOrder(User user, List<Product> products) {
        return new Order()
                .setUser(user)
                .setProducts(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", products=" + products +
                '}';
    }

}
