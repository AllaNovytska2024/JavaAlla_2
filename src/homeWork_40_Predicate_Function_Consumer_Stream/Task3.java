package homeWork_40_Predicate_Function_Consumer_Stream;/*
@date 10.07.2024
@author Sergey Bugaienko
*/

/*
Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
 */

import java.util.function.BiConsumer;

public class Task3 {
    public static void main(String[] args) {

        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println(key + "=" + value);
        biConsumer.accept(1, "Test");
    }
}