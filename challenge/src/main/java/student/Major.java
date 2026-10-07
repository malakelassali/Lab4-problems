package student;

import java.util.Arrays;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    public static final Major COMPUTER_SCIENCE= new Major("23", "Computer Science");

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount == 50) {
            System.out.println(this.name + " major has reached maximal capacity of students.");
            return;
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

    public boolean limitReached() {
        return studentCount == 50;
    }

    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCne().equals(cne)) {
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne) {
        Student student = findStudentByCNE(cne);

        if (student == null) {
            return false;
        }
        for (int i=0; i<studentCount; i++) {
            if (students[i] == student) {
                for (int j=i; j<studentCount-1; j++) {
                    students[j] = students[j+1];
                }
                students[studentCount - 1]= null;
                studentCount--;
                return true;
            }
        }
        return false;
    }

    public double getOccupancyRate() {
        return ((double) studentCount / 50) * 100;
    }

    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<studentCount; i++) {
            sb.append(i+1).append(". ").append(students[i].getCne()).append(" ").append(students[i].getFullNameFormatted()).append("\n");
        }

        return sb.toString();
    }

    public String toString() {
        return "Major{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }

    // Display all students in the major
    public void displayStudents() {
        for (int i=0; i<studentCount; i++) {
            System.out.println(
                    (i+1) + ". " +
                            students[i].getCne() + " " +
                            students[i].getFirstName() + " " +
                            students[i].getSecondName()
            );
        }
    }
}