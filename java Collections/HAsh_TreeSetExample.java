import java.util.*;

public class HAsh_TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grape");

        // a) Reverse the elements (Not directly possible with TreeSet)
        // We can convert it to a List and then reverse it
        List<String> reversedList = new ArrayList<>(treeSet);
        Collections.reverse(reversedList);
        System.out.println("Reversed elements: " + reversedList);

        // b) Iterate the elements using Iterator
        System.out.println("Iterating elements:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Check if a particular element exists
        String elementToCheck = "Orange";
        if (treeSet.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in the TreeSet");
        } else {
            System.out.println(elementToCheck + " does not exist in the TreeSet");
        }
    }
}
