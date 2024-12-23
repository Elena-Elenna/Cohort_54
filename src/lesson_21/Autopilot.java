package lesson_21;

public class Autopilot {
    private String softwareVersion;

    private Autobus autobus; //двунаправленная связь


    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }


    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder("Autopilot: {");
        stb.append("SV: ").append(softwareVersion);
        stb.append("}");
        return stb.toString();
    }

    public String getSoftwareVersion() {return this.softwareVersion;}

    public void setSoftwareVersion( String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Autobus getAutobus() {return this.autobus;}

    public void setAutobus(Autobus autobus) {this.autobus = autobus;}
}
