
package SoalNo3;
import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private List<String> doc;

    public UserProfile(int user_id, String password, String name, int age, String email_id) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = new ArrayList<>();
    }

    public int get_User_id() {
        return user_id;
    }

    public String get_password() {
        return password;
    }

    public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }

    public String get_email() {
        return email_id;
    }

    public void edit_profile() {
        System.out.println("Editing profile...");
    }

    public void show_documents() {
        System.out.println("Documents: " + doc);
    }
}
