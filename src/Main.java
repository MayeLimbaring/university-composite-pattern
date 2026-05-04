public class Main {
    public static void main(String[] args) {

        College engineering = new College("College of Engineering");
        College business = new College("College of Business");

        Department csDept = new Department("Computer Science");
        Department engDept = new Department("Engineering");
        Department marketingDept = new Department("Marketing");

        csDept.add(new Teacher("Alice", "Java", 50000));
        csDept.add(new Teacher("Bob", "Python", 45000));

        engDept.add(new Teacher("Charlie", "Mechanics", 55000));
        marketingDept.add(new Teacher("Diana", "Marketing", 40000));

        csDept.add(new Student("John", "S001", 20000));
        csDept.add(new Student("Jane", "S002", 20000));

        engDept.add(new Student("Mark", "S003", 18000));
        marketingDept.add(new Student("Lisa", "S004", 15000));

        engineering.add(csDept);
        engineering.add(engDept);

        business.add(marketingDept);

        College subCollege = new College("Tech Sub-College");
        subCollege.add(new Student("SubStudent", "S005", 10000));

        engineering.add(subCollege);

        System.out.println("===== UNIVERSITY STRUCTURE =====");
        engineering.display("");
        business.display("");

        System.out.println("\nTotal Students (Engineering): " + engineering.getStudentCount());
        System.out.println("Total Budget (Engineering): " + engineering.getBudget());
    }
}