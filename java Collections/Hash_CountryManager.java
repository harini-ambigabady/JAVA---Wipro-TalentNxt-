import java.util.HashSet;

public class Hash_CountryManager {
    private HashSet<String> h1;

    public Hash_CountryManager() {
        h1 = new HashSet<>();
    }

    public HashSet<String> saveCountryNames(String countryName) {
        h1.add(countryName);
        return h1;
    }

    public String getCountry(String countryName) {
        return h1.contains(countryName) ? countryName : null;
    }

    public static void main(String[] args) {
        Hash_CountryManager manager = new Hash_CountryManager();
        manager.saveCountryNames("India");
        manager.saveCountryNames("USA");
        manager.saveCountryNames("France");

        System.out.println(manager.getCountry("India")); // Output: India
        System.out.println(manager.getCountry("Germany")); // Output: null
    }
}
