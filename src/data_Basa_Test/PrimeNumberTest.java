package data_Basa_Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import test_Nastroiky_All.PrimeNumberChecker;

//Использование параметризированных тестов
//Параметризованные тесты позволяют запускать один тестовый метод
// с разными наборами данных. Они полезны для проверки многих случаев,
// использующих одну и ту же логику.
// Для этого используйте аннотации
// @ParameterizedTest и @ValueSource, @CsvSource или @MethodSource.


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