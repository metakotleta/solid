package shopHomework;

/**
 * \* Created with IntelliJ IDEA.
 * \* Author: Prekrasnov Sergei
 * \* Date: 22.04.2022
 * \* ----- group JAVA-27 -----
 * \*
 * \* Description: Домашнее задание к занятию 1.4: Magics, DRY, SOLID
 * \*
 * \* Задача: Задача Магазин
 * \
 */
public class Main {
    public static final char RUB = (char) 0x20BD; //Magic Numbers Principle - вместо чисел используем константы

    public static void main(String[] args) {

        //Liskov substitution principle - наследники класса Product полностью играют роль предка
        Product[] products = {new Bread(), new Apple(), new Meet(), new Beer()};
        printProducts(products);

        while (true) {
            // Single Responsibility Principle
            String ask = GetData.getData("Введите номер товара и количество через пробел или введите `end` ");
            if ("end".equals(ask)) break;
            String[] parts = ask.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        printProducts(products);
        printBasket(products);
    }

    /**
     * Используем правило DRY
     * Вывод на консоль
     *
     * @param products - вывод значений массива product
     */
    private static void printProducts(Product[] products) {
        System.out.println("Список возможных товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    /**
     * Используем правило DRY
     * Вывод на консоль
     *
     * @param products - вывод значений массива product
     */
    private static void printBasket(Product[] products) {
        int costProducts = 0;
        System.out.println("Ваша корзина: ");
        for (Product product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " 'количество'= " + product.getCount() + " шт."
                        + " 'цена'= " + product.getPrice() + " " + RUB
                        + " 'стоимость'= " + product.getCount() * product.getPrice() + " " + RUB);
            }
        }
        System.out.println("Итого: " + costProducts + " " + RUB);
    }
}