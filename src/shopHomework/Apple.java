package shopHomework;

public class Apple extends Product {
    private final String name = "Яблоки";
    private final int price = 120;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}