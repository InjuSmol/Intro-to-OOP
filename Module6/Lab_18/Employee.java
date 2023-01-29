//An employee has an office, salary, and experience (number of years,
//        integer value).
public class Employee extends Person {
    private int office;
    private double salary;

    private int experience;

    public Employee(String name, String address, String phone,
                    String email, int off, double sal, int exp) {
        super(name, address, phone, email);

        this.office = off;
        this.salary = sal;
        this.experience = exp;
    }

    public int getOffice() {
        return office;
    }
    public double getSalary() {
        return salary;
    }
    public int setExperience() {
        return experience;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(int exp ) {
        this.experience= exp;
    }
    public String toString() {
        return super.toString() + "\n   Office: " + office +
                "\n   Salary: $" + getSalary() + "\n   Experience: " +experience;
    }
}
