package student;

public class Test {
    public static void main(String[] args) {

        Major computerScience = Major.COMPUTER_SCIENCE;
        Major business = new Major("24", "Business Administration");
        Major biology = new Major("25", "Biology");

        Student s1 = new Student(
                "Safi",
                "Amal",
                "0611111111",
                "amal@gmail.com",
                "22885676"
        );

        Student s2 = new Student(
                "Alami",
                "Samir",
                "0622222222",
                "samir@gmail.com",
                "23585976",
                computerScience
        );

        Student s3 = new Student(
                "Bennani",
                "Sara",
                "0633333333",
                "sara@gmail.com",
                "24987456",
                business
        );

        Student s4 = new Student(
                "Tazi",
                "Youssef",
                "0644444444",
                "youssef@gmail.com",
                "24123456",
                biology
        );

        System.out.println("The list of students in the computer science major is:");
        System.out.println(computerScience.getStudentListAsString());

        Student found = computerScience.findStudentByCNE("22885676");
        System.out.println("Student found: " + found);

        System.out.println("Student count: " +
                computerScience.getStudentCount());

        System.out.println("Occupancy rate: " +
                computerScience.getOccupancyRate() + "%");

        boolean removed =
                computerScience.removeStudent("22885676");

        System.out.println("Student removed: " + removed);

        System.out.println("\nAfter removal:");
        System.out.println(computerScience.getStudentListAsString());

        System.out.println("Student count: " +
                computerScience.getStudentCount());

        System.out.println("Occupancy rate: " +
                computerScience.getOccupancyRate() + "%");
    }
}