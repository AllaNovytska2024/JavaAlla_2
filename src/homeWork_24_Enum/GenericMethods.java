package homeWork_24_Enum;
// Generic методы позволяют определять методы с параметрами типа,
// которые будут объявлены и использоваться в методе.
// Это полезно, когда метод должен работать с различными типами.
// Здесь метод printArray принимает массив любого типа T и выводит его элементы на экран.
public class GenericMethods {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = new Integer []{-10, -9, 1, 5, 10, 22, 23, 25, 15, 7, 3, -5};
        String[] stringArray = new String[]{"Jan", "Feb", "Mar", "Apr",
        "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


        printArray(intArray);    // Output: 1 2 3 4 5 
        printArray(stringArray); // Output: Hello World
    }
}