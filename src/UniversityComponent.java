public interface UniversityComponent {

    void add(UniversityComponent component);
    void remove(UniversityComponent component);
    void display(String indent);

    int getStudentCount();
    double getBudget();
}