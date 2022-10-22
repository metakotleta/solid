package shopHomework;

public class Beer extends Product {
    private final String name = "Пиво";
    private final int price = 50;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}