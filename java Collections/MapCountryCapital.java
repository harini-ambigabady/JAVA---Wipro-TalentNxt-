import java.util.*;

public class MapCountryCapital {
    private HashMap<String, String> countryCapitalMap;

    public void CountryCapitalMap() {
        countryCapitalMap = new HashMap<>();
    }

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        countryCapitalMap.put(countryName, capital);
        return countryCapitalMap;
    }

    public String getCapital(String countryName) {
        return countryCapitalMap.get(countryName);
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            if (entry.getValue().equals(capital)) {
                return entry.getKey();
            }
        }
        return null; // Capital not found
    }

    public HashMap<String, String> swapKeyValues() {
        HashMap<String, String> capitalCountryMap = new HashMap<>();
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            capitalCountryMap.put(entry.getValue(), entry.getKey());
        }
        return capitalCountryMap;
    }

    public ArrayList<String> getCountryNames() {
        ArrayList<String> countryNames = new ArrayList<>(countryCapitalMap.keySet());
        return countryNames;
    }

    public static void main(String[] args) {
        MapCountryCapital map = new MapCountryCapital();
        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Japan", "Tokyo");

        System.out.println(map.getCapital("India"));
        System.out.println(map.getCountry("Tokyo"));

        HashMap<String, String> swappedMap = map.swapKeyValues();
        System.out.println(swappedMap);

        ArrayList<String> countries = map.getCountryNames();
        System.out.println(countries);
    }
}
