package homeWork_21_Game;
/*
@ date 13.06.24
@ aouthor Alla Novytska

Создайте абстрактный класс GameCharacter,
который представляет базовый класс для игровых персонажей.
Определите абстрактный метод attack(),
который будет различаться для разных типов персонажей
(например, воин атакует мечом, а маг использует магические заклинания).
Создайте несколько конкретных подклассов,
 представляющих разные типы персонажей, такие как Warrior, Mage, Archer, и т. д.
Переопределите метод attack() для каждого класса.
Создайте массив из игровых персонажей разных типов.
 Вызовите у каждого метод attack() в цикле.
 */

public class CharacterApp {
        public static void main(String[] args) {
            // Создаем массив из игровых персонажей разных типов
            GameCharacter[] characters = {
                    new Warrior(),
                    new Mage(),
                    new Cat(),
                    new Elephant(),
                    new Alien(),
                    new Human()
            };

            // Вызываем метод attack() у каждого персонажа в цикле
            for (GameCharacter character : characters) {
                character.attack();
            }
            // Вызываем метод stopAttack() у каждого персонажа в цикле
            for (GameCharacter character : characters){
                character.stopAttack();
            }

            new Warrior().attack();
            new Elephant().stopAttack();
            new Human().attack();
        }
    }



