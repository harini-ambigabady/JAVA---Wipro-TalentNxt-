import java.util.Scanner;
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}


public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get details for two students
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter the name of student " + i + ":");
                String name = scanner.nextLine();

                int[] marks = new int[3];
                for (int j = 0; j < 3; j++) {
                    System.out.println("Enter mark for subject " + (j + 1) + ":");
                    String markStr = scanner.nextLine();

                    // Parse and validate the mark
                    int mark = Integer.parseInt(markStr);
                    validateMark(mark);

                    marks[j] = mark;
                }

                // Calculate average
                double average = calculateAverage(marks);

                // Display results
                System.out.println("Student: " + name);
                System.out.println("Average Marks: " + average);
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integer marks.");
        } catch (NegativeValueException | OutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to validate mark
    private static void validateMark(int mark) throws NegativeValueException, OutOfRangeException {
        if (mark < 0) {
            throw new NegativeValueException("Mark cannot be negative.");
        }
        if (mark > 100) {
            throw new OutOfRangeException("Mark must be between 0 and 100.");
        }
    }

    // Method to calculate average
    private static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
