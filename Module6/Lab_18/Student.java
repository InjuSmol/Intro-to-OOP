//A student has a class status (freshman, sophomore, junior or senior). Define
//        the status as constant.
public class Student extends Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    public Student(String n, String a,
                   String p, String e, int status) {

        super(n, a, p, e);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "--";
        }
    }
    public String toString() {
        return super.toString() + "\n   Status: " + getStatus();
    }
}
