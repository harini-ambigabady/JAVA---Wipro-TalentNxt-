import java.util.ArrayList;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {
        // Create an ArrayList that can store only Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Adding some elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Call the printAll method to print all elements
        printAll(stringList);
    }

    // Method to print all elements of the ArrayList using an Iterator
    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
