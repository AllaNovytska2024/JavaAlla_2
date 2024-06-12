package autopark;/*
@date 10.06.2024
@author Sergey Bugaienko
*/



public class BusDriver {
    private String licenseNumber;
    private autopark.Autobus autobus;

    public BusDriver(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("{ autopark.BusDriver: ");
        sb.append(licenseNumber).append("; bus:");
        sb.append(autobus != null ? autobus.getId() : " {out of bus}");
        sb.append(" }");

        return sb.toString();

//        return "{autopark.BusDriver: " + licenseNumber + "; bus:" + autobus.getId() + "}";
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public autopark.Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(autopark.Autobus autobus) {
        this.autobus = autobus;
    }
}

