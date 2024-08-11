import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Map_StateCapitals {
    public static void main(String[] args) {
        Properties capitals = new Properties();

        // Add some states and their capitals
        capitals.setProperty("Maharashtra", "Mumbai");
        capitals.setProperty("Karnataka", "Bengaluru");
        capitals.setProperty("Tamil Nadu", "Chennai");
        capitals.setProperty("Gujarat", "Gandhinagar");

        // Get all the keys (states)
        Set<Object> keys = capitals.keySet();

        // Iterate through the keys and print the state and capital
        Iterator<Object> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String state = (String) iterator.next();
            String capital = capitals.getProperty(state);
            System.out.println(state + ": " + capital);
        }
    }
}
