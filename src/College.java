import java.util.ArrayList;
import java.util.List;

public class College implements UniversityComponent {

    private String name;
    private List<UniversityComponent> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(UniversityComponent component) {
        components.add(component);
    }

    public void remove(UniversityComponent component) {
        components.remove(component);
    }

    public void display(String indent) {
        System.out.println(indent + "College: " + name);
        for (UniversityComponent comp : components) {
            comp.display(indent + "   ");
        }
    }

    public int getStudentCount() {
        int total = 0;
        for (UniversityComponent comp : components) {
            total += comp.getStudentCount();
        }
        return total;
    }

    public double getBudget() {
        double total = 0;
        for (UniversityComponent comp : components) {
            total += comp.getBudget();
        }
        return total;
    }
}