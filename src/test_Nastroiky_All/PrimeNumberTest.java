package test_Nastroiky_All;

/*
Что такое JUnit
https://mate.academy/blog/ru/qa-ru/java-testing-junit-examples/
JUnit — это открытый фреймворк для написания и запуска тестов на языке программирования Java.
Он разработан с целью поддержки автоматизированных тестов, особенно модульных тестов (unit tests),
и обеспечивает удобные аннотации, утверждения и утилиты,
которые позволяют легко писать и запускать тесты для Java-кода.

Параметризованные тесты
позволяют запускать один тестовый метод с разными наборами данных.
 Они полезны для проверки многих случаев, использующих одну и ту же логику.
Для этого используйте аннотации @ParameterizedTest и @ValueSource, @CsvSource или @MethodSource.

 */


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {

    private PrimeNumberChecker checker = new PrimeNumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17})
    public void testPrimeNumbers(int number) {
        assertTrue(checker.isPrime(number), number + " should be a prime number");
    }
}