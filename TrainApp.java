import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create HashMap to store bogie and capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();
        
        // Add bogies with their capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 48);
        bogieCapacity.put("First Class", 24);
        
        // Display bogie capacities
        System.out.println("Bogie Capacity Details:");
        System.out.println("------------------------");
        
        // Iterate through the map
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " seats");
        }
    }
}
