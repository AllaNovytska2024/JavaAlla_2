package array_All;

import java.util.Arrays;

public class Remove_Elements {


    public static short[] removeElement(short[] array, short value) {

        short[] res = new short[array.length - 1];
        int index;

        // ищем элемент
        for (index = 0; index < array.length; index++) {
            if (array[index] == value) {
                // если нашли отлично! выполняем програму дальше, под этим циклом
                break;
                // если последняя итерация и элемент не был равен искомому
            } else if (index == array.length - 1) {
                // массив меняться не должен, просто возвращаем его
                return array;
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            // если прошли индекс
            if (i >= index) {
                // копируем со сдвигом
                res[i] = array[i + 1];
            } else {
                // обычное копирование
                res[i] = array[i];
            }
        }
        array = res;
        return array;
    }

    public static short[] addElement(short[] array, short value, int index) {
        short[] res = new short[array.length + 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (i >= index) {
                // копируем со сдвигом
                res[i + 1] = array[i];
            } else {
                // обычное копирование
                res[i] = array[i];
            }
        }
        res[index] = value;
        array = res;
        return array;
    }


    public static void main(String[] args) {
        short[] array = {42, -4, 78, 10, 7, 61};
// удаляем заданный элемент 10
        short[] res = removeElement(array, (short)10);
        System.out.println(Arrays.toString(res));
        // вставляем  элемент 16 на индекс 2
        res = addElement(array, (short)16, 2); // а чтобы вставить в конец, используем array.length
        System.out.println(Arrays.toString(res));
    }
}