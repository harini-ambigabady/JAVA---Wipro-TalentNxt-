class InvalidCountryException extends Exception {
    
    // Default constructor
    public InvalidCountryException() {
        super();
    }

    // Constructor that accepts a message
    public InvalidCountryException(String message) {
        super(message);
    }
}
public class UserRegistration {

    // Method to register user
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!"India".equalsIgnoreCase(userCountry)) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    // Main method to test the registration
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        
        try {
            // Example 1: User from outside India
            registration.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            // Example 2: User from India
            registration.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
