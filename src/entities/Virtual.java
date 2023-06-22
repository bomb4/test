package entities;

import java.time.LocalDate;

public class Virtual extends Product {

    private String code;
    private LocalDate expirationDate;

    public Virtual(String name, double price, String code, LocalDate expirationDate) {
        super(name, price);
        this.code = code;
        this.expirationDate = expirationDate;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Virtual{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", code='" + code +
                ", expirationDate=" + expirationDate +
                '}';
    }

}
