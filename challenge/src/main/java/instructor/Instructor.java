package instructor;
import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject subject;

    public Instructor(String nom, String prenom, String telephone, String email, String employeeNumber, Subject subject) {
        super(nom, prenom, telephone, email);
        this.employeeNumber= employeeNumber;
        this.subject= subject;
    }

    public String cleanEmployeeNumber() {
        return employeeNumber.replace(" ", "");
    }




}
