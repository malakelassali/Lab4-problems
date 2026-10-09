package instructor;

public class Test {
    public static void main(String[] args) {

        Subject subject1 = new Subject(" cs-101 ", "introduction to java");
        Subject subject2 = new Subject(" mat-202 ", "linear algebra");

        Instructor instructor1 = new Instructor(
                "ALAMI",
                "Samir",
                "0612345678",
                "samir.alami@gmail.com",
                " AB 123 ",
                subject1
        );

        Instructor instructor2 = new Instructor(
                "BENNANI",
                "Sara",
                "0623456789",
                "sara.bennani@gmail.com",
                " CD 456 ",
                subject2
        );

        System.out.println("=== cleanEmployeeNumber ===");
        System.out.println(instructor1.cleanEmployeeNumber());
        System.out.println(instructor2.cleanEmployeeNumber());

        System.out.println("\n=== summaryLine ===");
        System.out.println(instructor1.summaryLine());
        System.out.println(instructor2.summaryLine());

        System.out.println("\n=== toCard ===");
        System.out.println(instructor1.toCard());

        System.out.println("\n");
        System.out.println(instructor2.toCard());

        System.out.println("\n=== displayName ===");
        System.out.println(instructor1.displayName());
        System.out.println(instructor2.displayName());

        System.out.println("\n=== normalizedCode ===");
        System.out.println(subject1.normalizedCode());
        System.out.println(subject2.normalizedCode());

        System.out.println("\n=== properTitle ===");
        System.out.println(subject1.properTitle());
        System.out.println(subject2.properTitle());

        System.out.println("\n=== isIntroCourse ===");
        System.out.println(subject1.isIntroCourse());
        System.out.println(subject2.isIntroCourse());

        System.out.println("\n=== syllabusLine ===");
        System.out.println(subject1.syllabusLine(instructor1));
        System.out.println(subject2.syllabusLine(instructor2));
    }
}
