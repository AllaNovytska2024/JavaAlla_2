package main_Utilits_;
/*
import java.util.Random;

public class Dog_Ability {
    String name;
    int jumpAbility; // Способность собаки к прыжку

    public Dog_Ability(String name, int jumpAbility) {
        this.name = name;
        this.jumpAbility = jumpAbility;

    }

    public String getName() {
        return name;
    }

    public int getJumpAbility;

    {
        return jumpAbility;
    }

    int[] barriers = new int[17]; // Создаем массив из 17 элементов (10 до 170, с шагом 10)
    int barrierValue = 10; // Начальное значение барьера

    // Заполняем массив значениями от 10 до 170
        for(
    int i = 0;
    i<barriers.length;i++)

    barriers[i]=10=i*10;
        }

// Выводим значения барьеров на экран
        for (int barrier : barriers) {
        System.out.println("Значение барьера: " + barrier);

         for (String dogName : dogNames) {
int attempts = 0; // Счетчик попыток для каждой собаки
boolean success; // Результат преодоления барьера

            for (int barrier : barriers) {
attempts++;
success = Math.random() < 0.5; // Произвольно определяем, удалось ли взять барьер

        System.out.println(dogName + " преодолел барьер " + barrier + ": " + success);

                if (!success) {
        break; // Если не удалось взять барьер, прекращаем попытки
        }
        }

        System.out.println(dogName + " потратил " + attempts + " попыток.");
        }
                }
                }






/*
      //  public int setJumpAbility; {
      //      return jumpAbility;
       // }


    // Создаем объекты с заданными именами
    // и случайными способностями к прыжку
    Dog[] dogs = new Dog[5];
    String[] names = {"Linda", "Dina", "Kasia", "Jessy", "Tom"};
 //   dogs[0]=new Dog("Linda",(int) (Math.random()*51)+30);
 //   dogs[1]=new Dog("Dina",(int) (Math.random()*51)+30);
 //   dogs[2]=new Dog("Kasia",(int) (Math.random()*51)+30);
 //   dogs[3]=new Dog("Jessy",(int) (Math.random()*51)+30);
 //   dogs[4]=new Dog("Tom",(int) (Math.random()*51)+30);

    Random random = new Random();

        for (int i = 0; i < dogs.length; i++) {
        int jumpAbility = random.nextInt(51) + 30; // Случайное число от 30 до 80
        dogs[i] = new Dog(names[i], jumpAbility);
        }

    // Выводим информацию о каждой собаке
        for (Dog dog : dogs) {
        System.out.println("Имя собаки: " + dog.getName() + ", способность прыжка: " + dog.getJumpAbility());
        }


// создадим массив барьеров, увеличивая значение барьера на 10 при каждой попытке.
// Заполним массив значениями от 10 до 170:

    int[] barriers = new int[17]; // Создаем массив из 17 элементов (10 до 170, с шагом 10)
    int barrierValue = 10; // Начальное значение барьера

    // Заполняем массив значениями от 10 до 170
        for (int i = 0; i < barriers.length; i++) {
        barriers[i] = barrierValue;
        barrierValue += 10; // Увеличиваем барьер на 10
    }

    // Выводим значения барьеров на экран
        for (int value : barriers) {
        System.out.print(value + " ");
    }

    {
        barriers[i] = 10 + i * 10;
    }

    int[] barriers = new int[17]; // Создаем массив из 17 элементов (10 до 170, с шагом 10)
    int barrierValue = 10; // Начальное значение барьера

    // Заполняем массив значениями от 10 до 170
        for (int i = 10; i < barriers.length; i++) {
        barriers[i] = barrierValue;
        barrierValue += 10; // Увеличиваем барьер на 10
    }

    // Выводим значения барьеров на экран
        for (int value : barriers) {
        System.out.print(value + " ");
    }



}}}
*/