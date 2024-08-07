import java.util.Scanner;

public class ArrayElementAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt user to enter the number of elements in the array
            System.out.println("Enter the number of elements in the array:");
            int size = Integer.parseInt(scanner.nextLine());

            // Create the array
            int[] array = new int[size];

            // Prompt user to enter the elements in the array
            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            // Prompt user to enter the index of the array element they want to access
            System.out.println("Enter the index of the array element you want to access:");
            int index = Integer.parseInt(scanner.nextLine());

            // Access and print the element at the specified index
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");

        } catch (NumberFormatException e) {
            System.out.println("Java.lang.NumberFormatException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Java.lang.ArrayIndexOutOfBoundsException");
        } finally {
            scanner.close();
        }
    }
}
