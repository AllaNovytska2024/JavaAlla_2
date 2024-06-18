package homeWork_24_Season;

public enum Season {
    SPRING(15), // средняя температура весной
    SUMMER(25), // средняя температура летом
    AUTUMN(10), // средняя температура осенью
    WINTER(0);  // средняя температура зимой

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "averageTemperature=" + averageTemperature +
                '}';
    }
}