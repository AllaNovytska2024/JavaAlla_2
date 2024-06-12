package autopark;/*
@date 10.06.2024
@author Sergey Bugaienko
*/

public class Autopilot1 {
    private String softwareVersion;

    public Autopilot1(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String toString(){
        return "{autopark.Autopilot. SV:" + softwareVersion + "}";
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
