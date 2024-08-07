
abstract class Vehicle {
    // Abstract methods
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}
class Hero extends Vehicle {
    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    // Constructor
    public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
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
    public int getSpeed() {
        return speed;
    }

    // Method to control radio
    public void radio() {
        System.out.println("Radio control in Hero vehicle.");
    }
}


class Honda extends Vehicle {
    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    // Constructor
    public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
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
    public int getSpeed() {
        return speed;
    }

    // Method to control CD player
    public void cdplayer() {
        System.out.println("CD player control in Honda vehicle.");
    }
}


public class TestVehicle {
    public static void main(String[] args) {
        // Create instances of Hero and Honda
        Hero hero = new Hero("Hero Model X", "HR1234", "John Doe", 60);
        Honda honda = new Honda("Honda Civic", "HC5678", "Jane Smith", 80);

        // Display details and use methods
        System.out.println("Hero Vehicle:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println("\nHonda Vehicle:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed() + " km/h");
        honda.cdplayer();
    }
}


