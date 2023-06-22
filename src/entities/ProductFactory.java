package entities;

import java.time.LocalDate;

public class ProductFactory {

    public static Real createRealProduct(String name, double price, double size, int weight) {
        return new Real(name, price, size, weight);
    }

    public static Virtual createVirtualProduct(String name, double price, String code, LocalDate expirationDate) {
        return new Virtual(name, price, code, expirationDate);
    }

}
