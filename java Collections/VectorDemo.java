import java.util.*;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee("Alice", 101));
        employees.add(new Employee("Bob", 102));
        employees.add(new Employee("Charlie", 103));

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }

        // Using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            Employee employee = enumeration.nextElement();
            System.out.println(employee);
        }
    }
}
