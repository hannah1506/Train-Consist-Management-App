import java.util.LinkedHashSet;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create LinkedHashSet to maintain insertion order with uniqueness
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
        
        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        
        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper");  // Duplicate - will be ignored
        
        // Display final formation in insertion order
        System.out.println("Final Train Formation: " + trainFormation);
        System.out.println("Note: LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("UC5 formation setup completed...");
    }
}
