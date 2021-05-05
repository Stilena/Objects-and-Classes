package Students;

public class Students_05 {
    private String firstName;
    private String lastName;
    private double grade;

    public Students_05(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }



    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        //"{first name} {second name}: {grade}"
        return String.format("%s %s: %.2f", firstName, lastName, grade);
    }
}
