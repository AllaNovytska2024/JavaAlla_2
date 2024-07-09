package lesson_36_Collection;

public class TimerExample {
    public static void main(String[] args) {
        // Измеряем и выводим время выполнения метода someMethod
        long duration = someMethod();
        System.out.println("Время выполнения метода: " + duration + " миллисекунд");
    }

    private static long someMethod() {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
       

        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();

        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }
}