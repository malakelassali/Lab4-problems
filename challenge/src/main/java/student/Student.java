package student;

import java.util.Locale;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student() {}
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        if (!major.limitReached()) {
            this.major = major;
            major.addStudent(this);
        }
    }

    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        if (!Major.COMPUTER_SCIENCE.limitReached()) {
            this.major= Major.COMPUTER_SCIENCE;
            Major.COMPUTER_SCIENCE.addStudent(this);
        }
    }

    // Getters
    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }

    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", cne=" + cne +
                ", major=" + (major!= null ? major.getName() : "No major") +
                '}';

    }

    public String getFullNameFormatted() {
        StringBuilder fullName= new StringBuilder(secondName.toUpperCase());
        fullName.append(", ").append(firstName);
        return fullName.toString();
    }

}