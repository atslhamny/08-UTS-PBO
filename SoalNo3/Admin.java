package SoalNo3;
public class Admin extends User {
    public Admin(int user_id, String password, String name, int age, String email_id) {
        super(user_id, password, name, age, email_id);
    }

    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Updating vehicle details for ID: " + vehicle_id);
        // Implementation for updating vehicle details
    }

    public void add_vehicle(String vehicleDetails) {
        System.out.println("Adding new vehicle: " + vehicleDetails);
        // Implementation for adding a new vehicle
    }

    public void Retrieve_complain() {
        System.out.println("Retrieving complaints...");
        // Implementation for retrieving complaints
    }

    public void verify_user() {
        System.out.println("Verifying user...");
        // Implementation for user verification process
    }
}