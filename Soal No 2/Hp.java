import java.util.ArrayList;

class Hp extends MobileDevice {
    private String OSVersion;
    private String appName;
    private ArrayList<String> installedApps;

    public Hp(String brand, String model, int batteryCapacity, String OSVersion) {
        super(brand, model, batteryCapacity);
        this.OSVersion = OSVersion;
        this.installedApps = new ArrayList<>();
    }

    public void installApps(String appName) {
        installedApps.add(appName);
        System.out.println(appName + " installed successfully");
    }

    public void UninstallApps(String appName) {
        if (installedApps.remove(appName)) {
            System.out.println(appName + " uninstalled successfully");
        } else {
            System.out.println(appName + " not found");
        }
    }

    public void listApps() {
        System.out.println("Installed apps: " + String.join(", ", installedApps));
    }

    public String getOSInfo() {
        return "OS Version: " + OSVersion;
    }
}