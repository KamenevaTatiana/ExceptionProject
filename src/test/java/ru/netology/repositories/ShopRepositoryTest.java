package ru.netology.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    ShopRepository shop = new ShopRepository();

    Product product1 = new Product(1, "Молоко", 95);
    Product product2 = new Product(2, "Яйца", 129);
    Product product3 = new Product(3, "Хлеб", 69);

    @Test
    public void shouldRemoveById() {
        shop.add(product1);
        shop.add(product2);
        shop.add(product3);

        shop.removeById(3);

        Product[] expected = {product1, product2};
        Assertions.assertArrayEquals(expected, shop.findAll());
    }

    @Test
    public void shouldNotFoundException() {
        shop.add(product1);
        shop.add(product2);
        shop.add(product3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            shop.removeById(4);
        });
    }
}
