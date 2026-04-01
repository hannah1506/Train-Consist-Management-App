import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create HashMap to store bogie names and capacities
        HashMap<String, Integer> bogieCapacity = new HashMap<>();
        
        // Add bogies with capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        
        System.out.println("All Bogies:");
        bogieCapacity.forEach((name, capacity) -> 
            System.out.println(name + " : " + capacity + " seats"));
        
        // Filter bogies with capacity > 60 using Streams
        List<Map.Entry<String, Integer>> filteredBogies = bogieCapacity.entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 60)
            .collect(Collectors.toList());
        
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies found with capacity > 60");
        } else {
            for (Map.Entry<String, Integer> entry : filteredBogies) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " seats");
            }
        }
        
        // Verify original list unchanged
        System.out.println("\nOriginal List Unchanged:");
        System.out.println(bogieCapacity);
    }
}
