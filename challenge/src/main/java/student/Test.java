package student;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("Ali", "Amrani", "0612345678", "ali@gmail.com");

        System.out.println("=== Person test ===");
        System.out.println(p1);

        System.out.println("First name: " + p1.getFirstName());
        System.out.println("Email: " + p1.getEmail());

        p1.setPhone("0699999999");
        System.out.println("New phone: " + p1.getPhone());



        Major cs = new Major("CS", "Computer Science");

        System.out.println("\n=== Major test ===");
        System.out.println("Major ID: " + cs.getId());
        System.out.println("Major code: " + cs.getCode());
        System.out.println("Major name: " + cs.getName());



        Student s1 = new Student(
                "Malak",
                "Elassali",
                "0611111111",
                "malak@gmail.com",
                "CNE001",
                cs
        );

        Student s2 = new Student(
                "Sara",
                "Bennani",
                "0622222222",
                "sara@gmail.com",
                "CNE002",
                cs
        );

        Student s3 = new Student(
                "Yassine",
                "Alaoui",
                "0633333333",
                "yassine@gmail.com",
                "CNE003"
        );


        System.out.println("\n=== Student test ===");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



        System.out.println("\nCNE of s1: " + s1.getCne());
        System.out.println("Major of s1: " + s1.getMajor().getName());


        s3.setMajor(cs);
        s3.setCne("CNE999");

        System.out.println("\nAfter modification:");
        System.out.println(s3);

        cs.addStudent(s1);
        cs.addStudent(s2);
        cs.addStudent(s3);

        System.out.println("\nNumber of students: " + cs.getStudentCount());

        System.out.println("\n=== Students in Computer Science ===");
        cs.displayStudents();
    }
}

