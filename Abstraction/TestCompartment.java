import java.util.Random;

// Abstract class Compartment
abstract class Compartment {
    // Abstract method
    public abstract String notice();
}

// Derived class FirstClass
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class Compartment";
    }
}

// Derived class Ladies
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}

// Derived class General
class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment";
    }
}

// Derived class Luggage
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment";
    }
}

// Test class
public class TestCompartment {
    public static void main(String[] args) {
        // Array of Compartment of size 10
        Compartment[] compartments = new Compartment[10];
        
        // Random number generator
        Random random = new Random();
        
        // Fill the array with random compartments
        for (int i = 0; i < compartments.length; i++) {
            int compartmentType = random.nextInt(4) + 1; // Generates a number between 1 and 4
            
            switch (compartmentType) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        
        // Display the notice for each compartment
        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}
