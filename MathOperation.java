public class MathOperation {
    public static void main(String[] args) {
        // Check if exactly 5 arguments are provided
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 integer arguments.");
            return;
        }

        int[] numbers = new int[5];
        int sum = 0;
        double average = 0.0;

        try {
            // Parse command line arguments into the array
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            // Calculate the sum
            for (int number : numbers) {
                sum += number;
            }

            // Calculate the average
            average = (double) sum / numbers.length;

            // Display the results
            System.out.println("Sum of array elements: " + sum);
            System.out.println("Average of array elements: " + average);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: One or more arguments are not valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Error in arithmetic operations.");
        } finally {
            // Optionally, you could add code here to clean up resources if needed
        }
    }
}
