package appartment;

public class Apartment_Good {
    public static boolean isGoodApartment(int area, String street) {
        // Если площадь больше или равна 100, считаем квартиру хорошей
        // Или если площадь больше или равна 80 и улица - "Main Street", также считаем квартиру хорошей
        return area >= 100 || (area >= 80 && "Main Street".equals(street));
    }


}
/*
isGoodApartment(91, "Queens Street"); // false
isGoodApartment(78, "Queens Street"); // false
isGoodApartment(70, "Main Street"); // false
isGoodApartment(120, "Queens Street"); // true
isGoodApartment(120, "Main Street"); // true
isGoodApartment(80, "Main Street"); // true
 */