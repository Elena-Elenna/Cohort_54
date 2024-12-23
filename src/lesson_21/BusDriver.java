package lesson_21;

public class BusDriver {
    private static int idCounter = 100;

    private final int id;
    private String name;
    private String licenseNumber;

    public BusDriver(String name, String licenseNumber) {
        this.id = idCounter++;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder("Bus Driver: {");
        sb.append("id: ").append(id);
        sb.append("; name: ").append(name);
        sb.append("}");

        return sb.toString();
    }

    public int getId() {return this.id;}

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public String getLicenseNumber() {return this.licenseNumber;}

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
