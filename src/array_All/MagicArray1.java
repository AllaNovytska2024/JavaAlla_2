package array_All;

public class MagicArray1 {
    private int[] array;
    private int cursor; // присвоено значение по умолчанию - 0

    public MagicArray1() {
        array = new int[10];
    }

    // Добавляют в массив один элемент
    void add(int value) {
        // Добавлять значение в наш массив

        // Проверка. Есть ли вообще место во внутреннем массиве?
        if (cursor == array.length - 1) {
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    //Динамическое расширение размера массива
    void expandArray() {
        System.out.println("Расширяем массив! " + cursor);
        /*
        1. Создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все (значимые) значения из старого
        3. Перебросить ссылку
         */

        int[] newArray = new int[array.length * 2]; // создаю новый массив, в 2 раза больше текущего array

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого в новый
        }

        // Перебросить ссылку. Переменная array хранила ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено! ");
    }


    // Добавляет в массив несколько элементов
    void add(int... numbers) {
        // numbers - я могу обращаться точно также, как со ссылкой на массив

        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return Integer.MIN_VALUE; // хорошего решения нет на этой стадии
            // TODO Поправить обработку не корректного индекса
        }
    }

    int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по этому индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
         */

        if (index < 0 || index >= cursor) {
            //индекс не валидный. Ничего в массиве не трогаем
            return Integer.MIN_VALUE; //Todo
        }

        int value = array[index];

        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;

        System.out.println("cursor - 1 : " + array[cursor -1]);
        System.out.println("Тут тоже 19: " + array[cursor]);
        return value;
    }


    // Возвращает строковое представление массива
    public String toString() {
        if (cursor == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            sb.append(array[i]).append((i < cursor - 1) ? ", " : "]");
        }
        return sb.toString();
    }



}
// Дополнение домашка
/*
 public class MagicArray2() {
    private int[] array;
    private int cursor; // Default value is 0

    public MagicArray2() {
        array = new int[10];
    }

    // Добавляем один эллемент в массив
    public void addElement(int value) {
        if (cursor < array.length) {
            array[cursor] = value;
            cursor++;
        } else {
            System.out.println("Массив заполнен, не могу добавить больше эллементов.");
        }
    }

    // Другой метод добавлен здесь= много элементов добавляем

    public static void main(String[] args) {
        MagicArray2 magicArray = new MagicArray2();
        magicArray.addElement(42);
        // Пример : добавляем эллементы, столько сколько нужно

    }
}

public class MagicArray2 {
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
1. Добавлять в массив элемент ++
2. Динамическое изменение состояния массива (размера) ++
3. Возвращать строковое представление массива ++
4. Добавлять в массив сразу несколько значений ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу ++
7. Удаление элемента по индексу (Есть индекс - удалить этот элемент из массива). Вернуть старое значение ++

8. Конструктор, который принимает массив и создает MagiArray с такими же значениями
9. Удаление элемента по значению remove ByValue()
10. Поиск элемента по значению - вернуть индекс indexOf()
11. Замена значения по индексу (есть индекс и новое значение)
 */


