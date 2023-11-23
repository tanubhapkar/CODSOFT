package code;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    // Method to add a student to the collection
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to remove a student from the collection
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Method to search for a student by name
    public Student searchStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null; // Student not found
    }

    // Method to display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
