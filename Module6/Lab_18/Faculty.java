
public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email,
                   int office, double salary, int experience, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, experience);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {

        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + "\n   Office hours: " + officeHours +
                "\n   Rank: " + rank;
    }
}
