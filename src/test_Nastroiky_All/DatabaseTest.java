package test_Nastroiky_All;

import org.junit.jupiter.api.*;

public class DatabaseTest {

    private DatabaseConnection connection;

    @BeforeAll
    public static void setupClass() {
        // Выполнить действия перед всеми тестами в классе
    }

    @BeforeEach
    public void setup() {
        connection = new DatabaseConnection();
        connection.connect();
        // Выполнить действия перед каждым тестом
    }

    @Test
    public void testDatabaseQuery() {
        // Тестирование запроса к базе данных
    }

    @AfterEach
    public void tearDown() {
        connection.disconnect();
        // Выполнить действия после каждого теста
    }

    @AfterAll
    public static void tearDownClass() {
        // Выполнить действия после всех тестов в классе
    }
}