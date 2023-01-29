public class Staff extends Employee {

    private String title;

    public Staff(String na, String ad, String ph,
                 String em, int of, double sal, int ex, String t) {
        super(na, ad, ph, em, of, sal, ex);
        this.title = t;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return super.toString() + "\n   Title: " + title;
    }
}