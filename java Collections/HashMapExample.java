import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store String objects
        Map<String, String> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");

        // a) Check if a particular key exists
        String keyToCheck = "key2";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists.");
        } else {
            System.out.println("Key " + keyToCheck + " does not exist.");
        }

        // b) Check if a particular value exists
        String valueToCheck = "value3";
        boolean valueExists = false;
        for (String value : hashMap.values()) {
            if (value.equals(valueToCheck)) {
                valueExists = true;
                break;
            }
        }
        if (valueExists) {
            System.out.println("Value " + valueToCheck + " exists.");
        } else {
            System.out.println("Value " + valueToCheck + " does not exist.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("Iterating through the HashMap:");
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
