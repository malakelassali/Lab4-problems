package student;

public class Test {
    public static void main(String[] args) {

        // a. Create a couple of majors
        Major computerScience = Major.COMPUTER_SCIENCE;
        Major business = new Major("24", "Business");
        Major biology = new Major("25", "Biology");

        // b. Create students associated with these majors

        Student s1 = new Student(
                "SAFI",
                "Amal",
                "0611111111",
                "amal@gmail.com",
                "22885676"
        );

        Student s2 = new Student(
                "ALAMI",
                "Samir",
                "0622222222",
                "samir@gmail.com",
                "23585976",
                computerScience
        );

        Student s3 = new Student(
                "BENNANI",
                "Sara",
                "0633333333",
                "sara@gmail.com",
                "24987456",
                business
        );

        Student s4 = new Student(
                "TAZI",
                "Youssef",
                "0644444444",
                "youssef@gmail.com",
                "24123456",
                biology
        );

        // c. Display Computer Science students
        System.out.println("The list of students in the computer science major is:");
        computerScience.displayStudents();
    }
}