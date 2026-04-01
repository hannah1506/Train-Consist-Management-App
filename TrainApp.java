import java.util.*;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create HashMap to store bogie names and capacities
        HashMap<String, Integer> bogieCapacity = new HashMap<>();
        
        // Add bogies with capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        
        System.out.println("Before Sorting:");
        System.out.println(bogieCapacity);
        
        // Convert to List for sorting
        List<Map.Entry<String, Integer>> list = new ArrayList<>(bogieCapacity.entrySet());
        
        // Sort by capacity using Comparator
        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        
        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " seats");
        }
    }
}
