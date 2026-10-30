package tr.istiklal.edu;

public class Faculty extends Employee {
    private String officeHours;
    private int rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, int rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() { return officeHours; }
    public int getRank() { return rank; }

    @Override
    public String toString() {
        return "Sınıf: Faculty, İsim: " + name;
    }
}