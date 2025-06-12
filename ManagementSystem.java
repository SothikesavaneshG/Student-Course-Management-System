package studentmgmt;

import java.util.*;

public class ManagementSystem {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n1. Add Student\n2. Add Course\n3. Enroll Student\n4. View Students\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addCourse();
                case 3 -> enrollStudent();
                case 4 -> viewStudents();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        students.add(new Student(name));
        System.out.println("Student added.");
    }

    private void addCourse() {
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        System.out.print("Enter course fee: ");
        double fee = sc.nextDouble();
        courses.add(new Course(name, fee));
        System.out.println("Course added.");
    }

    private void enrollStudent() {
        viewStudents();
        System.out.print("Enter student index to enroll: ");
        int sIndex = sc.nextInt();
        viewCourses();
        System.out.print("Enter course index to enroll in: ");
        int cIndex = sc.nextInt();
        if (sIndex >= 0 && sIndex < students.size() && cIndex >= 0 && cIndex < courses.size()) {
            students.get(sIndex).enroll(courses.get(cIndex));
            System.out.println("Enrollment successful.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private void viewStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i));
        }
    }

    private void viewCourses() {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(i + ": " + courses.get(i));
        }
    }
}
