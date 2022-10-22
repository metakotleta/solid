package shopHomework;

public class Bread extends Product implements ActionWithFood {
    //Open Closed Principle - имплементируя интерфейс ActionWithFood мы добавляем
    // классу функциональности, не изменяя его код
    private final String name = "Хлеб";
    private final int price = 70;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void action() {
        System.out.println("Хлеб нарезан");
    }
}