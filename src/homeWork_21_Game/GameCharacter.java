package homeWork_21_Game;

// Абстрактный класс GameCharacter
abstract class GameCharacter {
    // Абстрактный метод attack(), который будет переопределен в подклассах
    abstract void attack();
    abstract void stopAttack();
}

// Подкласс Warrior
class Warrior extends GameCharacter {
    @Override
    void attack() {
        System.out.println("Воин атакует мечом; ");
    }
    void stopAttack(){
        System.out.println( " Воин вложил меч в ножны, прекратив атаку");
    }
}

// Подкласс Mage
class Mage extends GameCharacter {
    @Override
    void attack() {
        System.out.println("Маг использует магические заклинания; ");
    }
    void stopAttack(){
        System.out.println( "Маг прячет магический предмет, прекращая атаку; ");
    }
}

// Подкласс Cat
class Cat extends GameCharacter {
    @Override
    void attack() {
        System.out.println("Кот атакует когтями; ");
    }
    void stopAttack(){
        System.out.println( "Кот прячет когти и мурлычет, прекращая атаку; ");
    }
}

// Подкласс Elephant
class Elephant extends GameCharacter {
    @Override
    void attack() {
        System.out.println("Слон атакует ногами; ");
    }
    void stopAttack(){
        System.out.println( "Слон отступает на шаг и склоняет голову, прекращая атаку; ");
    }
}

// Подкласс Alien
class Alien extends GameCharacter {
    @Override
    void attack() {
        System.out.println("Alien атакует кислотной слюной; ");
    }

    @Override
    void stopAttack() {
        System.out.println(" Alien останавливая атаку, маскируется убегая на дистанцию; ");
    }
}

// Подкласс Human
class Human extends GameCharacter {
    @Override
    void attack() {
        System.out.println("Человек атакует хитростью; ");
    }

    @Override
    void stopAttack() {
        System.out.println(" Человек останавливает атаку хитростью, если нет опасности; ");
    }
}

