package SoalNo3;
public class Customer extends User {
    private boolean verification_status;

    public Customer(int user_id, String password, String name, int age, String email_id) {
        super(user_id, password, name, age, email_id);
        this.verification_status = false;
    }

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String doc) {
        System.out.println("Applying for verification with document: " + doc);
    }
}