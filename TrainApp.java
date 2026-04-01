import java.util.HashSet;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create HashSet for unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();
        
        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101");  // Duplicate - will be ignored
        bogieIDs.add("BG102");  // Duplicate - will be ignored
        bogieIDs.add("BG104");
        
        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIDs);
        System.out.println("Total unique bogies: " + bogieIDs.size());
        System.out.println("Duplicate IDs were automatically removed!");
    }
}
