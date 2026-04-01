import java.util.LinkedList;

public class TrainConsistApp {
    
    public static void main(String[] args) {
        // Create LinkedList for ordered train consist
        LinkedList<String> trainConsist = new LinkedList<>();
        
        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        
        System.out.println("Initial Train Consist: " + trainConsist);
        
        // Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + trainConsist);
        
        // Remove first bogie
        trainConsist.removeFirst();
        System.out.println("After removing first bogie: " + trainConsist);
        
        // Remove last bogie
        trainConsist.removeLast();
        System.out.println("After removing last bogie: " + trainConsist);
        
        // Display final ordered train consist
        System.out.println("Final Ordered Train Consist: " + trainConsist);
    }
}
