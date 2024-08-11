import java.util.LinkedList;

 class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to print person details
    public void printPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

 class PersonDB {
    private LinkedList<Person> list;

    // Constructor
    public PersonDB() {
        list = new LinkedList<>();
    }

    // Method to add a person
    public boolean addPerson(Person p) {
        return list.add(p);
    }

    // Method to delete a person by name
    public boolean deletePerson(String name) {
        for (Person p : list) {
            if (p.getName().equals(name)) {
                return list.remove(p);
            }
        }
        return false;
    }

    // Method to show details of a person by name
    public String showPersonDetails(String name) {
        for (Person p : list) {
            if (p.getName().equals(name)) {
                p.printPersonDetails();
                return "Details shown above.";
            }
        }
        return "Person not found.";
    }

    // Method to print all persons
    public void printAllPersons() {
        for (Person p : list) {
            p.printPersonDetails();
            System.out.println(); // Print a newline for better formatting
        }
    }
}
public class LinkedList_1 {
    public static void main(String[] args) {
        PersonDB personDB = new PersonDB();

        // Adding persons
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);
        personDB.addPerson(person1);
        personDB.addPerson(person2);

        // Printing all persons
        System.out.println("All Persons:");
        personDB.printAllPersons();

        // Showing person details
        System.out.println(personDB.showPersonDetails("John"));

        // Deleting a person
        System.out.println("Deleting Person named John: " + personDB.deletePerson("John"));

        // Printing all persons after deletion
        System.out.println("All Persons after deletion:");
        personDB.printAllPersons();
    }
}

