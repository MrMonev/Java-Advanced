package kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;


    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    // method -> Add
    public boolean addChild(Child child) {
        // false -> Ако нямаме място
        if (this.registry.size() >= this.capacity) {
            return false;
        }
        // true -> Ако имаме място
        this.registry.add(child);
        return true;
    }

    // method -> Remove
    public boolean removeChild(String firstName) {
        for (Child child : this.registry) {
            if (child.getFirstName().equals(firstName)) {
                this.registry.remove(child);
                return true;
            }
        }
        // нито едно дете не е с даденото име
        return false;
    }

    // method -> Count
    public int getChildrenCount() {
        return this.registry.size();
    }

    // method -> getChild
    public Child getChild(String firstName) {
        for (Child child : this.registry) {
            if (child.getFirstName().equals(firstName)) {
                return child;
            }
        }
        // няма такова дете
        return null;

//        method -> getChild
//        return this.registry.stream().filter
//        (ch -> ch.getFirstName().equals(firstName)).findFirst().orElse(null);
    }

    public String registryReport() {


        List<Child> sortedListOfChildren = this.registry.stream().sorted
                        (Comparator.comparing(Child::getAge)
                                .thenComparing(Child::getFirstName)
                                .thenComparing(Child::getLastName))
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Registered children in %s", this.name));
        sb.append(System.lineSeparator()); // Нов ред на всички операционни системи

        for (Child child : sortedListOfChildren) {
            sb.append("--").append(System.lineSeparator());
            sb.append(child.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
