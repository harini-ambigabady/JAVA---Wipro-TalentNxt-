class InvalidAgeException extends Exception {
    // Constructor that accepts a message
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class PersonRegistration {

    public static void main(String[] args) {
        // Check if exactly 2 arguments are provided
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly 2 arguments: name and age.");
            return;
        }

        String name = args[0];
        String ageStr = args[1];

        try {
            // Parse the age argument
            int age = Integer.parseInt(ageStr);

            // Validate the age
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Error: Age must be >= 18 and < 60.");
            }

            // If no exceptions, print the valid input
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration successful.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
