public class Device {
    protected String brand;
    protected String model;
    protected boolean isPoweredOn;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isPoweredOn = false;
    }

    public String getInfo() {
        return "Brand: " + brand + ", Model: " + model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void powerOff() {
        isPoweredOn = false;
        System.out.println("Device powered off");
    }

    public void powerOn() {
        isPoweredOn = true;
        System.out.println("Device powered on");
    }
}