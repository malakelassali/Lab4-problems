package instructor;

import java.util.Locale;

public class Subject {
    private int id;
    private String code;
    private String title;
    private static int nextId = 1;

    public Subject(String code, String title) {
        this.id = nextId++;
        this.code = code;
        this.title = title;
    }

    public String normalizedCode() {
        return code.trim().toUpperCase();
    }

    public String properTitle() {
        String[] words = title.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public boolean isIntroCourse() {
        return (this.title.toLowerCase().contains("intro") || this.code.toLowerCase().startsWith("intro"));
    }

    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();
        sb.append(code)
                .append(" - ")
                .append(title)
                .append(" (Instructor: ")
                .append(instructor.getFirstName())
                .append(" ")
                .append(instructor.getSecondName())
                .append(")");
        return sb.toString();
    }
}
