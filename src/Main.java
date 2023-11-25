import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private String department;

    public Student(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }
}

class Course {
    private String courseName;
    private String courseId;
    private String department;

    public Course(String courseName, String courseId, String department) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getDepartment() {
        return department;
    }
}

class StudentCourseRegistration {
    private Student student;
    private Course course;

    public StudentCourseRegistration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Department: " + student.getDepartment());
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course ID: " + course.getCourseId());
        System.out.println("Department: " + course.getDepartment());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        Student student = new Student(name, id, department);

        System.out.println("Enter course details:");
        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Course ID: ");
        String courseId = scanner.nextLine();
        Course course = new Course(courseName, courseId, department);

        StudentCourseRegistration registration = new StudentCourseRegistration(student, course);
        System.out.println("\nStudent and Course details:");
        registration.displayStudentDetails();
        registration.displayCourseDetails();
    }
}