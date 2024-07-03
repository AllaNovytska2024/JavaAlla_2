package data_Basa_Test;

import org.junit.jupiter.api.Test;

//Использование отложенных тестов
//Вложенные тесты позволяют группировать тесты во вложенных классах.
// Это полезно для структурирования тестов и предотвращения дублирования кода.


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Nested
    class AddingItems {

        @Test
        public void testAddSingleItem() {
            // Тестирование добавления одного товара
        }

        @Test
        public void testAddMultipleItems() {
            // Тестирование добавления нескольких товаров
        }
    }

    @Nested
    class RemovingItems {

        @Test
        public void testRemoveItem() {
            // Тестирование удаления товара
        }

        @Test
        public void testRemoveNonExistingItem() {
            // Тестирование удаления несуществующего товара
        }
    }
}