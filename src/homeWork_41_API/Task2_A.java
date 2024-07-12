package homeWork_41_API;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
@ data 11.07.2024
@ author Alla Novytska

Task 2
Имеется список строк.
Используя Stream API,
найдите строку с максимальной длиной.
 */
public class Task2_A {
    public static void main(String[] args) {
        taskDog();
    }

    private static void taskDog() {

            Dog dog = new Dog("Tor", 2, "black", "Milan" );
            Dog dog1 = new Dog("Odin", 7, "gold", "Berlin");
            Dog dog2 = new Dog("Meduza", 5, "grey", "Hameln");
            Dog dog3 = new Dog("Luna", 4,"multicolor", "Berlin");
            Dog dog4 = new Dog("Kasia", 15, "orange","Kiev");
            Dog dog5 = new Dog("Berklay", 7, "tiger", "Kiev");

            Dog[] dogs = { dog, dog1, dog2, dog3, dog4, dog5};

            List<Dog> longDogsName = Arrays.stream(dogs)
                //    .filter(Object::nonNull(d.getName()))
                    .filter(d -> Objects.nonNull(d))
                    .filter((d -> d.getName().length() >6))
                    .collect(Collectors.toList());

            System.out.println(longDogsName);
        }
    }


