
package SoalNo3;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "password123", "John Doe", 30, "john@example.com");
        Admin admin = new Admin(2, "admin123", "Admin User", 35, "admin@example.com");

        customer.log_in(1, "123456");
        customer.apply_verification("passport.jpg");
        System.out.println("Customer verification status: " + customer.get_verification_status());

        admin.log_in(2, "654321");
        admin.update_vehicle_details(101);
        admin.add_vehicle("Toyota Corolla 2023");
        admin.Retrieve_complain();
        admin.verify_user();

        customer.log_out();
        admin.log_out();
    }
}