package lesson_23_systems2;

public abstract class VusaMember {

    private final String currency;
    private double curseBTC;
    public VusaMember(String currency){
        this.currency = currency;
        setActualBtcCource();
    }

    public void setActualBtcCource() {
        // запрос на сервер платежной системы
        // получать актуальный курс и присвоение его в поле
        this.curseBTC = 60_000;  // curseBTC поставляется, это только пример курса;
    }

    public String getCurrency() {
        return currency;
    }

    public double getCurseBTC() {
        return curseBTC;
    }

    public void setCurseBTC(double curseBTC) {
        this.curseBTC = curseBTC;
    }
}
