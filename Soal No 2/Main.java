public class Main {
    public static void main(String[] args) {
        Hp myPhone = new Hp("Samsung", "Galaxy S21", 4000, "Android 12");
        myPhone.powerOn();
        myPhone.charge(50);
        myPhone.installApps("WhatsApp");
        myPhone.installApps("Instagram");
        myPhone.listApps();
        System.out.println(myPhone.getInfo());
        System.out.println(myPhone.getBatteryInfo());
        System.out.println(myPhone.getOSInfo());
        myPhone.UninstallApps("WhatsApp");
        myPhone.listApps();
        myPhone.powerOff();
    }
}