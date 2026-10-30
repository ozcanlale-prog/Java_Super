package tr.istiklal.edu;
import java.util.*;

public class Person {
    protected String name; String address; String phoneNumber; String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name; this.address = address; this.phoneNumber = phoneNumber; this.email = email;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    @Override// ezer 
    public String toString() {
        return "Sınıf: Person, İsim: " + name;
    }
}