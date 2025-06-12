package studentmgmt;

public class Course {
    private String name;
    private double fee;

    public Course(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return name + " (₹" + fee + ")";
    }
}
