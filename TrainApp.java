import java.util.ArrayList;

public class TrainApp {
    
    public static void main(String[] args) {
        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();
        
        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        
        // Display after adding
        System.out.println("After Adding Bogies: Passenger Bogies : " + passengerBogies);
        
        // Remove 'AC Chair'
        passengerBogies.remove("AC Chair");
        
        // Display after removal
        System.out.println("After Removing 'AC Chair': Passenger Bogies : " + passengerBogies);
        
        // Check if Sleeper exists
        System.out.println("Checking if 'Sleeper' exists: Contains Sleeper? : " + passengerBogies.contains("Sleeper"));
        
        // Display final list
        System.out.println("Final Train Passenger Consist: " + passengerBogies);
        System.out.println("UC2 operations completed successfully...");
    }
}
