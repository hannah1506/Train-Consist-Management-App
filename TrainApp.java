import java.util.*;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create HashMap to store bogie names and capacities
        HashMap<String, Integer> bogieCapacity = new HashMap<>();
        
        // Add bogies with capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Sleeper", 72);  // Adding another Sleeper
        
        System.out.println("Bogie Capacities:");
        bogieCapacity.forEach((name, capacity) -> 
            System.out.println(name + " : " + capacity + " seats"));
        
        // Calculate total seats using reduce
        int totalSeats = bogieCapacity.values().stream()
            .reduce(0, Integer::sum);
        
        System.out.println("\nTotal Seats in Train: " + totalSeats);
    }
}
