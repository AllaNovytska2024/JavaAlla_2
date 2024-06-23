package lesson_23_generics;

public class Wrappers {
    //Классы-обертки используются в Java для представления примитивных типов данных как объектов.

    /*
    Byte - обертка для byte
    Short - обертка short
    Integer - обертка int
    Long - обертка long
    Float - обертка float
    Double - обертка double
    Character - обертка char
    Boolean - обертка boolean
     */
    // класс обертка для примитива.. не ссылочных типов
    // Byte, Short, Long, Float, Double, Boolean, но не инт int =  a Integer, char = a Character
    public static void main(String[] args) {

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println( "max : "  +  maxValue);
        System.out.println( "min : "  +  Integer.MIN_VALUE);

        maxValue = null;
        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);
        System.out.println(wrapperInt); //Автораспаковка. Из типа Integer автоматически преобразовало в примитив int

        int primitiveInt = wrapperInt; //Автораспаковка. Из типа Integer автоматически преобразовало в примитив int

        // Сравнение объектов
        // -128...127

        Integer a = 127;
        Integer b = 127;
        System.out.println( a == b ); //true   ot - 127  and +128
        System.out.println( a.equals( b ) ); //true

        Integer c = 128;
        Integer d = 128;
        System.out.println( c == d ); // falshe
        System.out.println( c.equals( d ) ); // true

        // Схожие методы для всех оберточных типов
        // 1. valueOf() - преобразует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("value of ==" + (e == f));

        Integer intStr = Integer.valueOf("123");
        System.out.println(intStr + 100); // 223

    }



}
