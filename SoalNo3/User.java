package SoalNo3;
public class User {
    protected UserProfile profile;

    // Konstruktor untuk User
    public User(int user_id, String password, String name, int age, String email_id) {
        this.profile = new UserProfile(user_id, password, name, age, email_id);
    }

    // Method untuk login
    public void log_in(int user_id, String password) {
        if (this.profile.get_User_id() == user_id && this.profile.get_password().equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    // Method tambahan
    public void log_out() {
        System.out.println("Logged out.");
    }
}
