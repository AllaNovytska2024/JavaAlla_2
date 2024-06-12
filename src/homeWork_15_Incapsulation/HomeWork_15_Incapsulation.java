package homeWork_15_Incapsulation;
/*
@ date 06.06.2024
@ author Alla Novytska

     Task 1
Повторить код, написанный на уроке

Реализовать оставшийся функционал
В резиновом массиве должны быть реализованы методы:
* Добавлять в массив элемент ++
* Динамическое изменение состояния массива (размера) ++
* Возвращать строковое представление массива ++
* Добавлять в массив сразу несколько значений ++
* Текущее количество элементов в массиве ++
* Возвращает значение по индексу ++
* Удаление элемента по индексу (Есть индекс - удалить этот элемент из массива).
Вернуть старое значение ++
* Конструктор, который принимает массив и создает MagiArray с такими же значениями
* Удаление элемента по значению remove ByValue()
* Поиск элемента по значению - вернуть индекс indexOf()
* Замена значения по индексу (есть индекс и новое значение)
* Вернуть наш магический массив в виде обычного массива -> int[] toArray()
*/

 class MagicArray2 {
    private int[] array;

    // Конструктор, принимающий массив
    public MagicArray2(int[] inputArray) {
        // Создаем новый массив с такими же значениями, как в inputArray
        array = new int[inputArray.length];
        System.arraycopy(inputArray, 0, array, 0, inputArray.length);
    }

    // Другие методы и функциональность MagicArray можно добавить здесь

    // Пример использования
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        MagicArray2 magicArray = new MagicArray2(originalArray);

        // Проверяем, что значения в magicArray такие же, как в originalArray
        for (int value : magicArray.array) {
            System.out.print(value + " ");
        }
    }
}


/*
     Task 2
Инкапсулировать класс MagicArray
 */

public class HomeWork_15_Incapsulation {

    private int[] array; // Приватное поле

    public HomeWork_15_Incapsulation(int size) {
        array = new int[size];
    }

    // Геттер для получения элемента по индексу
    public int getElement(int index) {
        return array[index];
    }

    // Сеттер для установки значения элемента по индексу
    public void setElement(int index, int value) {
        array[index] = value;
    }
}
