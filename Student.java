package studentmgmt;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course course) {
        enrolledCourses.add(course);
    }

    @Override
    public String toString() {
        return name + " - Enrolled in: " + enrolledCourses;
    }
}
