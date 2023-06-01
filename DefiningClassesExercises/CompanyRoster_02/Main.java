package DefiningClassesExercises.CompanyRoster_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // List<Employee> employees = new ArrayList<>();
        // department, List<Employee>
        Map<String, List<Employee>> employees = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            int tokensLength = tokens.length;
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String positions = tokens[2];
            String department = tokens[3];
            employees.putIfAbsent(department, new ArrayList<>());

            Employee employee;
            switch (tokensLength) {

                case 4:
                    employee = new Employee(name, salary, positions, department);

                    break;


                case 5:
                    if (tokens[4].contains("@")) {
                        employee = new Employee(name, salary, positions, department, tokens[4]);
                    } else {
                        employee = new Employee(name, salary, positions, department, Integer.parseInt(tokens[4]));
                    }
                    break;


                default:
                    employee = new Employee(name, salary, positions, department, tokens[4], Integer.parseInt(tokens[5]));
                    break;
            }

            employees.get(department).add(employee);
        }
        Map.Entry<String, List<Employee>> highestSalaryDepartment = employees.entrySet()
                .stream()
                .sorted(Comparator
                        .comparing((Map.Entry<String, List<Employee>>
                                            department) -> department.getValue().stream()
                                .mapToDouble(Employee::getSalary)
                                .average()
                                .getAsDouble(),Comparator.reverseOrder())
                ).findFirst()
                .orElse(null);

        System.out.printf("Highest Average Salary: %s%n", highestSalaryDepartment.getKey());
        highestSalaryDepartment.getValue()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(),e1.getSalary()) )
                .forEach(System.out::println);
    }
}
