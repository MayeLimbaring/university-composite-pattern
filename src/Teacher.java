public class Teacher implements UniversityComponent {

    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public void add(UniversityComponent component) {}

    public void remove(UniversityComponent component) {}

    public void display(String indent) {
        System.out.println(indent + "Teacher: " + name + " | Subject: " + subject + " | Salary: " + salary);
    }

    public int getStudentCount() {
        return 0;
    }

    public double getBudget() {
        return salary;
    }
}