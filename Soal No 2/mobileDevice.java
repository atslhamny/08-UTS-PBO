
class MobileDevice extends Device {
    protected int batteryCapacity;
    protected int amount;

    public MobileDevice(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
        this.amount = 0;
    }

    public void charge(int amount) {
        this.amount = Math.min(batteryCapacity, this.amount + amount);
        System.out.println("Battery charged to " + this.amount);
    }

    public void useBattery(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("Battery used. Remaining: " + this.amount);
        } else {
            System.out.println("Not enough battery");
        }
    }

    public String getBatteryInfo() {
        return "Battery Capacity: " + batteryCapacity + ", Current Charge: " + amount;
    }
}