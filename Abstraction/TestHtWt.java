class Compartment {
    private double height;
    private double width;
    private double breadth;

    // Constructor
    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }

    // Setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Method to display the compartment dimensions
    public void displayDimensions() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
    }
}


public class TestHtWt {
    public static void main(String[] args) {
        // Create a Compartment object
        Compartment shipCompartment = new Compartment(10.0, 15.0, 20.0);

        // Display the dimensions of the compartment
        shipCompartment.displayDimensions();

        // Modify and display new dimensions
        shipCompartment.setHeight(12.0);
        shipCompartment.setWidth(18.0);
        shipCompartment.setBreadth(25.0);

        System.out.println("Updated Dimensions:");
        shipCompartment.displayDimensions();
    }
}
