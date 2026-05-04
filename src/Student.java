public class Student implements UniversityComponent {

    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    public void add(UniversityComponent component) {}

    public void remove(UniversityComponent component) {}

    public void display(String indent) {
        System.out.println(indent + "Student: " + name + " | ID: " + studentId + " | Tuition: " + tuitionFee);
    }

    public int getStudentCount() {
        return 1;
    }

    public double getBudget() {
        return -tuitionFee;
    }
}