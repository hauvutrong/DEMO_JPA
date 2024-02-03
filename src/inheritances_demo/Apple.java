package inheritances_demo;

public class Apple extends Mobile{
    private boolean FaceId;
    public Apple() {
        System.out.println("This is Apple");

    }

    public Apple(String manufacture, String operatingSystem, String model, double cost, boolean faceId) {
        super(manufacture, operatingSystem, model, cost);
        FaceId = faceId;
    }

    public Apple(boolean faceId) {
        FaceId = faceId;
    }

    public void printName(){
        System.out.println("This is Apple made in :" + super.getManufacture());
    }
}
