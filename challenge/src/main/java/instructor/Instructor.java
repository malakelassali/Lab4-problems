package instructor;
import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject subject;

    public Instructor(String lastName, String firstName, String telephone, String email, String employeeNumber, Subject subject) {
        super(lastName, firstName, telephone, email);
        this.employeeNumber= employeeNumber;
        this.subject= subject;
    }

    public String cleanEmployeeNumber() {
        return employeeNumber.replace(" ", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", employeeNumber, this.secondName, this.firstName);
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append("Employee #: ").append(employeeNumber).append("\n");
        sb.append("Name: ").append(firstName).append(", ").append(secondName).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Phone: ").append(phone);
        return sb.toString();
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null) {
            sb.append(firstName);
        }
        if (secondName != null) {
            if (sb.length()>0) {
                sb.append(", ");
            }
            sb.append(secondName);
        }
        return sb.toString();
    }


}
