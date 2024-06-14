package homeWork_22_Triathlete;

// Класс Triathlete, реализующий оба интерфейса
class Triathlete implements Swimmer, Runner {
    @Override
    public void swim() {
        System.out.println("Triathlete плывет.");
    }
    @Override
    public void rebbitSwim() {
        System.out.println("Triathlete плывет методом Кроль.");
    }
    @Override
    public void stopSwim() {
        System.out.println("Triathlete остановился и не плывет.");
    }
    @Override
    public void startSwim() {
        System.out.println("Triathlete начал заплыв.");
    }

    @Override
    public void run() {
        System.out.println("Triathlete бежит.");
    }

    @Override
    public void stopRun() {
        System.out.println("Triathlete остановил свой бег.");
    }

    @Override
    public void startRun() {
        System.out.println("Triathlete начал бежать.");
    }
}
