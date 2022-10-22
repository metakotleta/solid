package shopHomework;

public class Meet extends Product implements ActionWithFood, FoodStatus {
    //Interface Segregation Principle - имплементируя интерфейс ActionWithFood мы добавляем
    // классу функциональности, не изменяя его код
    private final String name = "Мясо";
    private final int price = 75;

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
        System.out.println("Жарим шашлык :-) ");
    }

    @Override
    public void foodStatus() {
        System.out.println("Замачиваем шашлык :-) ");
    }
}