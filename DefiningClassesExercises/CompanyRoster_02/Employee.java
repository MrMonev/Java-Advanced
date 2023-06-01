package DefiningClassesExercises.CompanyRoster_02;

public class Employee {

    public String name;
    public double salary;
    public String positions;
    public String department;
    public String email;
    public int age;


    // 4 задължителни ->  4 parameters - усновен конструктор
    public Employee(String name, double salary, String positions, String department) {
        this.name = name;
        this.salary = salary;
        this.positions = positions;
        this.department = department;
        this.setAge(-1);
        this.setEmail("n/a");


    }
        // 4 задължителни + 1 опция (email) -> 5 parameters
    public Employee(String name, double salary, String positions, String department, String email) {
        this(name,salary,positions,department);
        this.email = email;
        this.setAge(-1);
    }
    // 4 задължителни + 1 опция (age) -> 5 parameters
    public Employee(String name, double salary, String positions, String department, int age) {
        this(name,salary,positions,department);
        this.age = age;
       this.setEmail("n/a");
    }

    // 4 задължителни + 2 опция (email, age) -> 6 parameters
    public Employee(String name, double salary, String positions, String department, String email, int age) {
        this(name,salary,positions,department);
        this.email = email;
        this.age = age;
    }
    // 4 задължителни + 1 опция (email)

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPositions() {
        return positions;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
            this.email = email;

    }

    public void setAge(int age) {
            this.age = age;

    }

    @Override
    public String toString() {
        // "Sam"  "840.20" "sam@sam.com" "-1"

        return String.format("%s %.2f %s %d", name,salary,email,age);

    }
}
