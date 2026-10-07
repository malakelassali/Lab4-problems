package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;

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
}
