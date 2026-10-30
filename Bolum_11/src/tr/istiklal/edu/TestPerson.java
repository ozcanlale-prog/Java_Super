package tr.istiklal.edu;
import java.util.*;

public class TestPerson {
    public static void main(String[] args) {
        MyDate date = new MyDate();

        Person person = new Person("Ahmet Yılmaz", "İstanbul", "5551112233", "ahmet@mail.com");
        Student student = new Student("Ayşe Demir", "Ankara", "5552223344", "ayse@mail.com", Student.JUNIOR);
        Employee employee = new Employee("Mehmet Kaya", "İzmir", "5553334455", "mehmet@mail.com", "Oda 101", 45000, date);
        Faculty faculty = new Faculty("Fatma Çelik", "Bursa", "5554445566", "fatma@mail.com", "Oda 202", 75000, date, "Pazartesi 10:00-12:00", 3);
        Staff staff = new Staff("Can Arslan", "Antalya", "5555556677", "can@mail.com", "Oda 303", 40000, date, "Bilgi İşlem Uzmanı");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}