package inheritances_demo;

public class Mobile {
    private String manufacture = "china";
    private String operatingSystem;
    private  String model;
    private double cost;

    public Mobile(String manufacture, String operatingSystem, String model, double cost) {
        this(); // gọi constructor của lớp hiện tại
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.cost = cost;
    }

    public Mobile() {
        System.out.println("This is Mobile");
    }



    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
