class Logan extends Vehicle {
    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    // Constructor
    public Logan(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    // Implement abstract methods
    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    // Method to get speed
    public int speed() {
        return speed;
    }

    // Method to control GPS
    public int gps() {
        System.out.println("GPS control in Logan vehicle.");
        return 1; // Dummy return value for GPS functionality
    }
}
class Ford extends Vehicle {
    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    // Constructor
    public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    // Implement abstract methods
    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    // Method to get speed
    public int speed() {
        return speed;
    }

    // Method to control temperature
    public int tempControl() {
        System.out.println("Temperature control in Ford vehicle.");
        return 22; // Dummy return value for temperature
    }
}


public class Test2Vehicle {
    public static void main(String[] args) {
        // Create instances of Hero, Honda, Logan, and Ford
        Hero hero = new Hero("Hero Model X", "HR1234", "John Doe", 60);
        Honda honda = new Honda("Honda Civic", "HC5678", "Jane Smith", 80);
        Logan logan = new Logan("Logan Sedan", "LG1234", "Alice Johnson", 90);
        Ford ford = new Ford("Ford Mustang", "FD5678", "Bob Brown", 100);

        // Display details and use methods for Hero
        System.out.println("Hero Vehicle:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed() + " km/h");
        hero.radio();

        // Display details and use methods for Honda
        System.out.println("\nHonda Vehicle:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed() + " km/h");
        honda.cdplayer();

        // Display details and use methods for Logan
        System.out.println("\nLogan Vehicle:");
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Registration Number: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.speed() + " km/h");
        logan.gps();

        // Display details and use methods for Ford
        System.out.println("\nFord Vehicle:");
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Registration Number: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.speed() + " km/h");
        ford.tempControl();
    }
}
