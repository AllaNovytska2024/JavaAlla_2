package homeWork_16_Dog_Jump_Calculator;
/*
@ date 06.05.2024
@ author Alla Novytska

Task 2
Написать класс Собака (Dog).
Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака,
не может быть больше, чем двукратная высота первоначального прыжка.

Также должен быть метод взять барьер.
В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки
 (будет ли данная собака в принципе в состоянии взять барьер).
 Если да -> идем тренироваться -> берет барьер

Добавить в класс константу.
Использовать эту константу в классе.

Добавить в класс поле, в котором будет храниться количество прыжков,
сделанных всеми объектами класса.
 */
 public class HomeWork_16_02_Dog_Jump {
    private String name;
    private double jumpHeight;
    private static final double MAX_JUMP_HEIGHT_MULTIPLIER = 2.0;
    private static int totalJumps = 0;

    public HomeWork_16_02_Dog_Jump(String name, double initialJumpHeight) {
        this.name = name;
        this.jumpHeight = initialJumpHeight;
    }

    public void train() {
        // Увеличиваем высоту прыжка на 10 сантиметров
        jumpHeight += 10;
        totalJumps++;
    }

    public boolean canJump(double barrierHeight) {
        // Проверяем, может ли собака преодолеть барьер
        return jumpHeight >= barrierHeight;
    }

    public void takeBarrier(double barrierHeight) {
        if (canJump(barrierHeight)) {
            System.out.println(name + " прыгает через барьер высотой " + barrierHeight + " см.");
        } else {
            System.out.println(name + " не может преодолеть барьер.");
        }
    }


    public static int getTotalJumps() {
        return totalJumps;
    }

    public static void main(String[] args) {
        HomeWork_16_02_Dog_Jump dog1 = new HomeWork_16_02_Dog_Jump("Барсик", 40.0);
        HomeWork_16_02_Dog_Jump dog2 = new HomeWork_16_02_Dog_Jump("Рекс", 50.0);

        dog1.train();
        dog1.takeBarrier(50.0); // Барьер высотой 50 см

        dog2.train();
        dog2.takeBarrier(65.0); // Барьер высотой 65 см

        System.out.println("Всего сделано прыжков: " + HomeWork_16_02_Dog_Jump.getTotalJumps());
    }
}
/*
Ответ консоли:
Барсик прыгает через барьер высотой 50.0 см.
Рекс не может преодолеть барьер.
Всего сделано прыжков: 2

 */