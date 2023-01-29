//A person has a name, address, phone number and
//        e-mail address.

public class Person {
    private String name;
    private String address;
    private String phoneN;
    private String email;

    public Person() {
        name = address = phoneN = email = "--";
    }

    public Person(String n, String a, String p, String e) {
        this.name = n;
        this.address = a;
        this.phoneN = p;
        this.email = e;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phoneN;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phoneN = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "\nName: " + name + "\n   Address: " + address +
                "\n   Phone number: " + phoneN + "\n   Email address: " + email;
    }
}

