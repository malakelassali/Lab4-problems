package student;

import java.util.Arrays;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[10];
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount == students.length) {
            students= Arrays.copyOf(students, studentCount * 2);
        }
        students[studentCount++]= s;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }


    // Display all students in the major
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}